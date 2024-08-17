package File_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program7 {
	public static void main(String[] args)
	{
		File f1=new File("Documents:\\Program1.java");
		Scanner sc=null;
		try {
			sc=new Scanner(f1);
			while(sc.hasNextLine())
			{
				System.out.println(sc.nextLine());
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File is Not Found!!");
		}
	finally {
		sc.close();
	}
	}

}
