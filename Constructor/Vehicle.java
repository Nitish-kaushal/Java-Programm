package Constructor;

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
		this.name=name;
	}
	Vehicle(double price)
	{
		this.price=price;
	}
	Vehicle(String name, double price)
	{
		this.name=name;
		this.price=price;
	}
	Vehicle(String name, double price, String color, int hp)
	{
		this.name=name;
		this.price=price;
		this.color=color;
		this.hp=hp;
	}
	Vehicle(String name, double price, String color, int hp, double length)
	{
		this.name=name;
		this.price=price;
		this.color=color;
		this.hp=hp;
		this.length=length;
	}
	public  void displayVehicle()
	{
		System.out.println("Name is: "+name);
		System.out.println("Price is: "+ price);
		System.out.println("Color is: "+ color);
		System.out.println("HP is: "+ hp);
		System.out.println("Length is: "+ length);
		System.out.println("=======================");
		
	    
	}
}
