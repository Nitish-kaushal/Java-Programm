package Inheritance;

public class Car extends Vehicle {
	int y=18;
	int a=60;
	
	public void start()
	{
		System.out.println("Start of Car");
	}
	public void test()
	{
		System.out.println("This is test method");
		System.out.println("Car class y is: "+this.y);
		System.out.println("Vehicle class x is: "+super.x);
		System.out.println("Car class a is: "+super.a);
		System.out.println("Vehicle a is: "+super.a);
		this.start();
		super.start();
		
		
	}

}
