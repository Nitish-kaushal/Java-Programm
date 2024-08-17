package File_handling;

import java.io.File;

public class Program2 {
	public static void main(String[] args)
	{
		File f1=new File("Documents:\\demo.txt");
		try {
			f1.createNewFile();
			System.out.println("File is created!!");
			f1.setWritable(false);
			System.out.println(f1.canWrite());
			System.out.println(f1.canRead());
			f1.setWritable(true);
			System.out.println(f1.getTotalSpace());
			System.out.println(f1.getName());
			System.out.println(f1.getAbsolutePath());
			System.out.println(f1.length());
			//f1.delete();
		}
		catch(Exception e) {
			System.out.println("File is not create!!");
			System.out.println("Either drive is not found or extension is not right");
			
		}
		System.out.println("Program ends!!");
	}

}
