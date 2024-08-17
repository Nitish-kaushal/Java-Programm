package File_handling;

import java.io.File;

public class Program3 {
	public static void main(String[] args)
	{
		File f1=new File("f:\\");
		
		File[] x=f1.listFiles();
		for(File p:x)
			System.out.println(p);
	}

}
