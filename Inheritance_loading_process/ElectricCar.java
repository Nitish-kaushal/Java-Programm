package Inheritance_loading_process;

public class ElectricCar extends Car
{
	int z=30;
	ElectricCar()
	{
		System.out.println("Electric Car No-arg constructor!");
	}
	ElectricCar(int x)
	{
		super(12);
		System.out.println("Electric Car int arg constructor!");
	}

}
