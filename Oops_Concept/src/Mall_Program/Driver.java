package Mall_Program;

public class Driver {
	public static void main(String[] args)
	{
		Mall m1= new Mall();
		m1.mall_name="DLF";
		m1.s1.name="Jethalal Shop";
		m1.s1.s.brand="Peter England";
		m1.s1.s.size=42;
		m1.s1.s.price=1234.0;

		System.out.println("Mall Name is: "+m1.mall_name);
		System.out.println("Shop Name is: "+m1.s1.name);
		System.out.println("Shirt Name is: "+m1.s1.s.brand);
		System.out.println("Shirt price is: "+m1.s1.s.price);
		System.out.println("Shirt size is: "+m1.s1.s.size);

		}
}
