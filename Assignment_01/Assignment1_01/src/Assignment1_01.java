import java.util.Scanner;
public class Assignment1_01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int number=scanner.nextInt();
		System.out.println("Give the number"+number);
		String binaryEquivalent=Integer.toBinaryString(number);
		String octalEquivalent=Integer.toOctalString(number);
		String hexaEquivalent=Integer.toHexString(number);
		
		System.out.println("Binary Equivalent"+binaryEquivalent);
		System.out.println("Ocatal Equivalent"+octalEquivalent);
		System.out.println("Hexa Equivqlent"+hexaEquivalent);
		scanner.close();

	}

}
