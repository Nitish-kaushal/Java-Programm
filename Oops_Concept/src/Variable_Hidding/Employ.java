package Variable_Hidding;

public class Employ {
	static int x=35;
	public static void test()
	{
		System.out.println("This is static test method");
		int x=50;
		System.out.println("Local x: "+x);
		System.out.println("static x: "+Employ.x);
	}
	
	public static void main(String[] args)
	{
		test();
	}		

}
