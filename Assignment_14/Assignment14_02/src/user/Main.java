package user;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

public class Main {
	static Date parseDate(String str) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            java.util.Date utilDate = sdf.parse(str);
            return new Date(utilDate.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int choice;
		do
		{
			System.out.println("1.Add user :");
			System.out.println("2.Update user by id:");
			System.out.println("3.Delete user by id");
			System.out.println("4.Display all user ");
			choice=scanner.nextInt();
			
			switch(choice)
			{
			case 1:
			    // Add new user
			    try (UserDAO dao = new UserDAO()) {
			    	System.out.println("Enter the first name: ");
			    	String fname = scanner.next();
			    	System.out.println("Enter the last name: ");
			    	String lname = scanner.next();
			    	System.out.println("Enter the email: ");
			    	String email = scanner.next();
			    	System.out.println("Enter the Password: ");
			    	String password = scanner.next();
			    	System.out.print("Birth Date (dd-MM-yyyy): ");
			    	String dob = scanner.next();
			    	System.out.println("Enter the status (true/false):");
			    	boolean status = scanner.nextBoolean();
			    	System.out.println("Enter the role");
			    	String role=scanner.next();
			    	User user = new User();
			    	user.setFirstname(fname);
			    	user.setLastname(lname);
			    	user.setEmail(email);
			    	user.setPassword(password);
			    	user.setDob(dob);
			    	user.setStatus(status);
			    	user.setRole(role);
			        int cnt = dao.save(user);
			        System.out.println("Users added: " + cnt);

			    } catch (Exception e) {
			        e.printStackTrace();
			    }
			    break;
			case 2:
			    // Update user by ID
			    try (UserDAO dao = new UserDAO()) {
			        System.out.println("Enter the ID of the user you want to update: ");
			        int id = scanner.nextInt();
			        System.out.println("Enter the first name: ");
			        String fname = scanner.next();
			        System.out.println("Enter the last name: ");
			        String lname = scanner.next();
			        System.out.println("Enter the email: ");
			        String email = scanner.next();
			        System.out.println("Enter the Password: ");
			        String password = scanner.next();
			        System.out.print("Birth Date (dd-MM-yyyy): ");
			        String dob = scanner.next();
			        //Date dob = parseDate(dobString);
			        System.out.println("Enter the status (true/false): ");
			        boolean status = scanner.nextBoolean();
			        System.out.println("Enter the role: ");
			        String role = scanner.next();

			        User user = new User();
			        user.setFirstname(fname);
			    	user.setLastname(lname);
			    	user.setEmail(email);
			    	user.setPassword(password);
			    	user.setDob(dob);
			    	user.setStatus(status);
			    	user.setRole(role);
			        int cnt = dao.save(user);
			        System.out.println("Users updated: " + cnt);
			    } catch (Exception e) {
			        e.printStackTrace();
			    }
			    break;
			case 3:
			    // Delete user by ID
			    try (UserDAO dao = new UserDAO()) {
			        System.out.println("Enter the ID of the user you want to delete: ");
			        int userId = scanner.nextInt();
			        
			        int cnt = dao.delete(userId);
			        System.out.println("Users deleted: " + cnt);
			    } catch (Exception e) {
			        e.printStackTrace();
			    }
			    break;
			case 4:
			    // Display all users
			    try (UserDAO dao = new UserDAO()) {
			        List<User> users = dao.getAllUsers();
			        users.forEach(l -> System.out.println(l));
			        } catch (Exception e) {
			        e.printStackTrace();
			    }
			    break;
			}
		}while(choice!=0);


	}


}
