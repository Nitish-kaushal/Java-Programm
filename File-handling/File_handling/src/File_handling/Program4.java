package File_handling;
import java.util.Scanner;
public class Program4 {
	public static void main(String[] args)throws Exception
	{
		Scanner sc=new Scanner(System.in);
		FileWrite fw=null;
		try {
			fw=new FileWrite("Documents:\\important.txt");
			System.out.println("File is created!");
			fw.write("Mohan is eating");
			System.out.println("please write your biodata: ");
			String s1=sc.nextLine();
			fw.write(s1);
		}
		catch(Exception e)
		{
			System.out.println("File is not created!!");
		}
		finally {
			fw.close();
		}
		System.out.println("program ends!!");
	}

}
