package Non_static_block;

public class Vehicle {
	int x;
	{
		x=45;
		System.out.println("Vehicle non-static block-1");
	}
	static {
		Vehicle v1=new Vehicle();
		System.out.println("This is static block-1");
	}
	public static void main(String[] args)
	{
		System.out.println("this is main method");
		{
			System.out.println("Local block");
		}
		System.out.println("=============");
		Vehicle v1=new Vehicle();
		System.out.println("=============");
		Vehicle v2=new Vehicle();
		System.out.println("=============");
		Vehicle v3=new Vehicle();
	}
	{
		System.out.println("Vehicle non-static block-2");
	}
	static
	{
		System.out.println("This is static block-2");
	}

}
