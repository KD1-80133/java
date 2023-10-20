package assignment12_03;
import java.util.*;
public class ArithmeticMain { 
	static void calculate(double num1, double num2, Arithmetic op) {
		double result = op.calc(num1, num2);
		System.out.println("Result: "+result);
		}

	
	

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		double num1,num2;
		System.out.println("Enter the Fisrt number :");
		num1=scanner.nextDouble();
		
		System.out.println("Enter the second number :");
		num2=scanner.nextDouble();
		
		int choice;
		do
		{
			System.out.println("1.Addition");
			System.out.println("2.Substraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("Enter your choice :");
			choice=scanner.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Addition is:");
				calculate(num1,num2,(x,y)->x+y);
				break;
			case 2:
				System.out.println("Substraction is:");
				calculate(num1,num2,(x,y)->x-y);
				break;
			case 3:
				System.out.println("Multiplication is:");
				calculate(num1,num2,(x,y)->x*y);
				break;
			case 4:
				System.out.println("Division is:");
				calculate(num1,num2,(x,y)->x/y);
				break;
			
			}
		
		}while(choice!=0);
	}
}
	




	
	


