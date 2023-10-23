package user;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class UserDAO implements AutoCloseable{
	private Connection con;
	public UserDAO() throws SQLException {
		con = DbUtil.getConnection();
	}
	@Override
	public void close() {
		try {
			if (con != null)
				con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// add new user
	public int save(User u) throws SQLException, ParseException {
	    String sql = "INSERT INTO users VALUES(default, ?, ?, ?, ?, ?, ?, ?)";
	    try (PreparedStatement stmt = con.prepareStatement(sql)) {
	        stmt.setString(1, u.getFirstname());
	        stmt.setString(2, u.getLastname());
	        stmt.setString(3, u.getEmail());
	        stmt.setString(4, u.getPassword());
	        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	        java.util.Date sDate = sdf.parse(u.getDob());
	        java.sql.Date dob = new java.sql.Date(sDate.getTime() );
	        stmt.setDate(5, dob);
	        stmt.setBoolean(6, u.isStatus());
	        stmt.setString(7,u.getRole());
	        int cnt = stmt.executeUpdate();
	        return cnt;
	    }
	}
	//Update user by id
	public int update(User u) throws SQLException, ParseException {
	    String sql = "UPDATE users SET firstname=?, lastname=?, email=?, password=?, dob=?, status=?, role=? WHERE id=?";
	    try (PreparedStatement stmt = con.prepareStatement(sql)) {
	        stmt.setString(1, u.getFirstname());
	        stmt.setString(2, u.getLastname());
	        stmt.setString(3, u.getEmail());
	        stmt.setString(4, u.getPassword());
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			java.util.Date uDate = sdf.parse(u.getDob());
			java.sql.Date dob = new java.sql.Date( uDate.getTime() );
			stmt.setDate(5, dob);
	        stmt.setBoolean(6, u.isStatus());
	        stmt.setString(7, u.getRole());
	        stmt.setInt(8, u.getId()); // Set the ID for the user you want to update

	        int cnt = stmt.executeUpdate();
	        return cnt;
	    }
	}
	//Delete user by id
	public int delete(int userId) throws SQLException {
	    String sql = "DELETE FROM users WHERE id = ?";
	    try (PreparedStatement stmt = con.prepareStatement(sql)) {
	        stmt.setInt(1, userId);
	        int cnt = stmt.executeUpdate();
	        return cnt;
	    }
	}
    // Display all users
	public List<User> getAllUsers() throws SQLException {
	    List<User> users = new ArrayList<>();
	    String sql = "SELECT * FROM users";
	    try (PreparedStatement stmt = con.prepareStatement(sql)) {
	        ResultSet resultSet = stmt.executeQuery();
	        while (resultSet.next()) {
	            int id = resultSet.getInt("id");
	            String firstname = resultSet.getString("first_name");
	            String lastname = resultSet.getString("last_name");
	            String email = resultSet.getString("email");
	            String password = resultSet.getString("password");
	            Date dob = resultSet.getDate("dob");
	            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	            String date = sdf.format(dob);
	            boolean status = resultSet.getBoolean("status");
	            String role = resultSet.getString("role");
	            User user = new User(id,firstname, lastname,email,password,date,status,role);
	            users.add(user);
	        }
	    }
	    return users;
	}



}
