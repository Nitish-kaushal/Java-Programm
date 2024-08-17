package Initialization_By_Method;

public class Shirt {

	String brand;
	int size;
	double price;
	public void setValue(String b, int s, double p)
	{
		brand=b;
		size=s;
		price=p;
	}
	public void displayDetails()
	{
		System.out.println("Brand is: "+brand);
		System.out.println("Size is: "+size);
		System.out.println("Price is: "+price);
		System.out.println("===================");
	}	

}
