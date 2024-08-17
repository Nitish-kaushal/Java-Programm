package exception_eclipse_program;

import java.io.IOException;

public class FileReadingProgram {
	public static void checkFile()throws IOException 
	{
		int x=-3;
		if(x>0)
		{
			System.out.println("x is greater than 0");
		}
		else
		{
			File f1=new File("Documents:\\test.txt");
			throw new IOException();
		}
	}

}
