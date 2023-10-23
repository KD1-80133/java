package Candidate;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int choice;
		do {
			System.out.println("1.Add new Candidate");
			System.out.println("2.Delete given Candidate");
			System.out.println("3.Modify name and party for the id");
			System.out.println("4.Get all Candidates");
			System.out.println("5.Increment Candidate votes");
			System.out.println("6.Get all Candidate of given party");
			System.out.println("7.Get partywise total votes");
	        choice=scanner.nextInt();
	        
	        switch(choice)
	        {
	        case 1:
	        	//Add new Candidate
	        	try(CandidateDAO dao = new CandidateDAO())
	        	{
	        		System.out.println("Enter the name :");
	        		String name=scanner.next();
	        		System.out.println("Enter the Party :");
	        		String party=scanner.next();
	        		System.out.println("Enter the votes :");
	        		int votes=scanner.nextInt();
	        		Candidate candidate = new Candidate();
	        	    candidate.setName(name);
	        	    candidate.setParty(party);
	        	    candidate.setVotes(votes);
	        	    int cnt=dao.save(candidate);
	        		System.out.println("Candidates added: " + cnt);
	        		
	        	}
	        	catch (Exception e) {
					e.printStackTrace();
				}
	        	break;
	        case 2:
	        	//Delete given Candidate
	        	try(CandidateDAO dao = new CandidateDAO()) {
	    			System.out.print("Enter candidate id to be deleted: ");
	    			int id = scanner.nextInt();
	    			int cnt = dao.deleteById(id);
	    			System.out.println("Candidates deleted: " + cnt);
	    		} // dao.close();
	    		catch (Exception e) {
	    			e.printStackTrace();
	    		}
	        	break;
	        case 3:
	        	//Update Candidate
	        	try(CandidateDAO dao = new CandidateDAO())
	        	{
	        		System.out.println("Candidate id to updated:");
	        		int id=scanner.nextInt();
	        		System.out.println("Enter the name :");
	        		String name=scanner.next();
	        		System.out.println("Enter the Party :");
	        		String party=scanner.next();
	        		System.out.println("Enter the votes :");
	        		int votes=scanner.nextInt();
	        		Candidate candidate = new Candidate();
	        	    candidate.setName(name);
	        	    candidate.setParty(party);
	        	    candidate.setVotes(votes);
	        	    candidate.setId(id);
	        	    int cnt=dao.update(candidate);
	        		System.out.println("Candidate updated: " + cnt);
	        		
	        	}
	        	catch (Exception e) {
					e.printStackTrace();
				}
	        	break;
	        case 4:
	        	//Get all Candidates
	        	try(CandidateDAO dao = new CandidateDAO()) {
	    			List<Candidate> list = dao.findAll();
	    			list.forEach(c -> System.out.println(c));
	    		} // dao.close();
	    		catch (Exception e) {
	    			e.printStackTrace();
	    		}
	        	break;
	        case 5:
	        	//Increment Candidate votes
	        	try(CandidateDAO dao = new CandidateDAO()) {
	    			System.out.print("Enter candidate id (to vote): ");
	    			int candidateId = scanner.nextInt();
	    			int cnt = dao.incrementVote(candidateId);
	    			System.out.println("Rows updated: " + cnt);
	    		} // dao.close();
	    		catch (Exception e) {
	    			e.printStackTrace();
	    		}
	        	break;
	        case 6:
	        	//Get all Candidate of given party
	        	try(CandidateDAO dao = new CandidateDAO()) {
	    			System.out.print("Enter party: ");
	    			String party = scanner.next();
	    			List<Candidate> list = dao.findByParty(party);
	    			list.forEach(c -> System.out.println(c));
	    		} // dao.close();
	    		catch (Exception e) {
	    			e.printStackTrace();
	    		}
	        	break;
	        case 7:
	        	try(PartyVotesDAO dao=new PartyVotesDAO())
	        	{
	        		List<PartyVotes> list = dao.getPartywiseVotes();
	        		list.forEach(p -> System.out.println(p));
	        	}//dao.close();
	        	catch (Exception e) {
					e.printStackTrace();
				}
	        	break;
	        default:
	        	System.out.println("Invalid choice. Please enter a valid option.");
	        }
		}while(choice!=0);

	}

}
