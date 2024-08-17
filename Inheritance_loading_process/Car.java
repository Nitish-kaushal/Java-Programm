package Inheritance_loading_process;

public class Car extends Vehicle {
	int y=20;
	
	Car()
	{
		System.out.println("Car No-arg constructor!");
		
	}
	Car(int x)
	{
		System.out.println("Car int arg constructor!");
	}

}
