package Inheritance_with_block;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		try {
			int n=sc.nextInt();
			System.out.println("n is: "+n);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("Input is not Valid!!");
		}
		finally {
			System.out.println("program ends!!");
			sc.close();
		}
	}

}
