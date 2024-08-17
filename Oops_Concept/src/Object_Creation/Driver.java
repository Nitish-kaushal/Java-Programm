package Object_Creation;

public class Driver {
	public static void main(String[] args)
	{
		Employ e1=new Employ();
		System.out.println(e1.name);
		System.out.println(e1.id);
		e1.work();
		System.out.println("==================");
		Vehicle v1=new Vehicle();
		System.out.println(v1.name);
		System.out.println(v1.price);
		System.out.println(v1.color);
		v1.run();

	}
}

