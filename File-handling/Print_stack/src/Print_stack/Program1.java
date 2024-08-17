package Print_stack;

public class Program1 {
	public static void main(String[]args)
	{
		try {
			Program2.test();
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("===============");
			e.printStackTrace();
			System.out.println("===============");
		}
		catch(Exception e)
		{
			System.out.println("Thank You!!");
		}
	}

}
