package File_handling;

import java.io.FileReader;
import java.io.IOException;

public class Program8 {
	public static void main(String[] args)
	{
		try {
			FileReader fr=new FileReader("Documents:\\program1.java");
			int x=fr.read();
			while(x!=-1)
			{
				System.out.println((char)x);
				x=fr.read();
			}
			catch(IOException e)
			{
				System.out.println("File Not Found!");
			}
		}
	}
}

			
