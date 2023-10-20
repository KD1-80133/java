package assignment12_07;


import java.util.Random;
import java.util.stream.IntStream;


public class RandomNumber {

	public static void main(String[] args) {
		Random r=new Random();
		int sum =IntStream.generate(()->r.nextInt(10))
				.limit(10)
				.sum();
		System.out.println(sum);
		
		

	}

}
