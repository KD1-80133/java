package assignment13_04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Buffer {

	public static void main(String[] args) {
		try (FileReader fr=new FileReader("/home/sunbeam/Assignment/JAVA_Assignments/Assignment_13/Assignment13_03/Buffer.txt")){
			try(BufferedReader br=new BufferedReader(fr)){
			String line;
			while((line = br.readLine())!=null)
			{
				System.out.println(line);
			}
			}
			
        } 
		catch (IOException e) 
		{
            e.printStackTrace();
        }
	}
}


