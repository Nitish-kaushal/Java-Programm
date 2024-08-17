package Inheritance_with_block;

public class Car extends Vehicle {
	static int q=305;
	public static void demo()
	{
		System.out.println("demo method");
	}
	Car()
	{
		System.out.println("Car Constructor");
	}
	static 
	{
		System.out.println("static block Car");
	}
	{
		System.out.println("Non-static block Car");
	}

	
}
