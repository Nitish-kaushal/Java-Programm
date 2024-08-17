package Copy_constructor;

public class Vehicle {
	String name;
	double price;
	String color;
	Vehicle()
	{
		
	}
	Vehicle(String name, double price, String color)
	{
		this.name=name;
		this.price=price;
		this.color=color;
	}
	Vehicle(Vehicle p)
	{
		this(p.name, p.price, p.color);
		/* this.name=p.name;
		 * this.price=p.price;
		 * this.color=p.color;
		 */
	}
	public void displayVehicle()
	{
		System.out.println("Name is: "+name);
		System.out.println("Price is: "+price);
		System.out.println("Color is: "+color);
		System.out.println("==============");
		
	}

}
