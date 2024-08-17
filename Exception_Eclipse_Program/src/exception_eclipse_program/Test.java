package exception_eclipse_program;

public class Test {
	public static int drive()
	{
		
		try {
			System.out.println(12/0);
		return 12;
		}
		catch(Exception e)
		{
			System.out.println(12/3);
		return 20;
		}
		finally {
			return 100;
		}
		
	}
}
