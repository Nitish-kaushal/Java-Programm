package Constructor_chaining;

public class Vehicle {
	String name;
	double price;
	String color;
	int hp;
	double length;
	Vehicle()
	{
		
	}
	Vehicle(String name)
	{
		this();
		this.name= name;
	}
	Vehicle(double price)
	{
		this.price=price;
	}
	Vehicle(String name, double price, String color)
	{
		
		this.color=color;
	}
	Vehicle(String name, double price, String color, int hp, double length)
	{
		
		this.length=length;
	}
	public void displayVehicle()
	{
		System.out.println("Name is: "+name);
		System.out.println("Price is: "+price);
		System.out.println("Color is: "+color);
		System.out.println("HP is: "+hp);
		System.out.println("Length is: "+length);
		System.out.println("================");
	}
}
