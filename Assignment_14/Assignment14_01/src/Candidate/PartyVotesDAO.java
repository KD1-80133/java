package Candidate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PartyVotesDAO implements AutoCloseable{
	private Connection con;
	public PartyVotesDAO() throws SQLException {
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
	//Get partywise total votes
	public List<PartyVotes> getPartywiseVotes() throws SQLException{
		List<PartyVotes> list = new ArrayList<>();
		String sql ="SELECT party, SUM(votes) AS total_votes FROM candidates GROUP BY party";
		try(PreparedStatement stmt = con.prepareStatement(sql))
		{
			try(ResultSet rs=stmt.executeQuery())
			{
				while(rs.next())
				{
					String party=rs.getString("party");
					
					int votes = rs.getInt("total_votes");
					PartyVotes p=new PartyVotes(party,votes);
					list.add(p);
				}
			}//rs.close();
		}//stmt.close();
		return list;
	}

}
