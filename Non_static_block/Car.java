package Non_static_block;

public class Car {
	{
		System.out.println("Non-static block");
		Car c=new Car();
	}
	static
	{
		System.out.println("Static block");
	}
	public static void main(String[] args)
	{
		System.out.println("main method");
		Car c1=new Car();
		System.out.println("============");
		Car c2=new Car();
	}

}
