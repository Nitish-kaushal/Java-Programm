package Inheritance_with_block;

public class ElectricCar extends Car{
	static int r=335;
	public static void start()
	{
		System.out.println("start method");
	}
	ElectricCar()
	{
		System.out.println("ElectricCar Constructor");
	}
	static {
		System.out.println("static block ElectricCar");
	}
}
