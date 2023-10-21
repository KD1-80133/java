package assignment13_03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class Buffer {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try (FileWriter fwr=new FileWriter("Buffer.txt")){
				
			try	(BufferedWriter bwr=new BufferedWriter(fwr)){
			
			System.out.println("Enter four lines :");
		
		for(int i=1; i<=4; i++) {
			String line = sc.nextLine();	
			bwr.write(line);
			bwr.newLine();
			}
		System.out.println("Lines have been written");
		}
		}
		catch (IOException e) 
		{
            e.printStackTrace();
        }
	}

}