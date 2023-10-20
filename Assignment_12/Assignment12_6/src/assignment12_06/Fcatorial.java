package assignment12_06;
import java.util.*;
import java.util.stream.Stream;
public class Fcatorial {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number :");
		int n = scanner.nextInt();
		Stream<Integer> strm = Stream.iterate(1, x->x+1).limit(n);
		int res=strm.reduce(1,(fact,i)->fact*i);
		System.out.println(res);
	}

}
