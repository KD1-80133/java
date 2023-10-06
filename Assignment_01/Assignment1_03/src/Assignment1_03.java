import java.util.Scanner;

public class Assignment1_03 {

	public static void main(String[] args) {
		int choice = 0;
	      int qty, price;
	      int totalDosaBill = 0, totalIdiliBill = 0, totalPohaBill = 0,
	    		  totalBurgerBill = 0, totalPizzaBill = 0,totalSamosaBill=0,totalChickenBill=0,totalPastaBill=0,totalNoddlesBill=0;
	      Scanner sc = new Scanner(System.in);
		
		while(choice!=11)
		{
			System.out.println("0.exit");
			System.out.println("1.Dosa");
			System.out.println("2.Idili");
			System.out.println("3.Poha");
			System.out.println("4.Burger");
			System.out.println("5.Pizza");
			System.out.println("6.Samosa");
			System.out.println("7.chicken");
			System.out.println("8.pasta");
			System.out.println("9.noddles");
			System.out.println("10.Genrate bill");
			choice=sc.nextInt();
			switch(choice)
			{
			case 0:
				System.out.println("Exit");
				break;
			case 1:
				System.out.println("Enter the quantity of dosa:");
	               qty = sc.nextInt();
	               price = 30;
	               totalDosaBill += qty * price;
	               System.out.println("Total bill for dosa: " + totalDosaBill);
	               break;
			case 2:
				System.out.println("Enter the quantity of idili:");
	               qty = sc.nextInt();
	               price = 30;
	               totalIdiliBill += qty * price;
	               System.out.println("Total bill for idili: " + totalIdiliBill);
	               break;
			case 3:
				System.out.println("Enter the quantity of poha:");
	               qty = sc.nextInt();
	               price = 30;
	               totalPohaBill += qty * price;
	               System.out.println("Total bill for poha: " + totalPohaBill);
	               break;
			case 4:
				System.out.println("Enter the quantity of Burger:");
	               qty = sc.nextInt();
	               price = 30;
	               totalBurgerBill += qty * price;
	               System.out.println("Total bill for Burger: " + totalBurgerBill);
	               break;
			case 5:
				System.out.println("Enter the quantity of pizza:");
	               qty = sc.nextInt();
	               price = 30;
	               totalPizzaBill += qty * price;
	               System.out.println("Total bill for Pizza: " + totalPizzaBill);
	               break;
			case 6:
				System.out.println("Enter the quantity of Samosa:");
	               qty = sc.nextInt();
	               price = 30;
	               totalSamosaBill += qty * price;
	               System.out.println("Total bill for Samosa: " + totalSamosaBill);
	               break;
			case 7:
				System.out.println("Enter the quantity of chicken:");
	               qty = sc.nextInt();
	               price = 30;
	               totalChickenBill += qty * price;
	               System.out.println("Total bill for Chicken: " + totalChickenBill);
	               break;
			case 8:
				System.out.println("Enter the quantity of pasta:");
	               qty = sc.nextInt();
	               price = 30;
	               totalPastaBill += qty * price;
	               System.out.println("Total bill for pasta: " + totalPastaBill);
	               break;
			case 9:
				System.out.println("Enter the quantity of Noddels:");
	               qty = sc.nextInt();
	               price = 30;
	               totalNoddlesBill += qty * price;
	               System.out.println("Total bill for Noddels: " + totalNoddlesBill);
	               break;
			case 10:
	               int totalBill = totalDosaBill + totalIdiliBill + totalPohaBill + totalBurgerBill + totalPizzaBill + totalSamosaBill + totalChickenBill + totalPastaBill+ totalNoddlesBill;
	               System.out.println("Total bill: " + totalBill);
	               break;
	            default:
	               System.out.println("Invalid menu entered");
	               break;
	        
			}
		}
	}

}
