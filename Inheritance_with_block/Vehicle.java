package Inheritance_with_block;

public class Vehicle {
	static int p=345;
	public static void test()
	{
		System.out.println("test method");
	}
	static {
		System.out.println("static block Vehicle");
	}
	{
		System.out.println("Non-static block Vehicle");
	}
	Vehicle()
	{
		System.out.println("Vehicle Constructor");
	}

}
