package upcasting_downcasting;

public class Driver1 {
	public static void main(String[] args) {
		Object o1=new ElectricCar();//upcasting
		Vehicle v1=(Vehicle)o1;//downcasting
		System.out.println(v1.a);
		System.out.println(v1.b);
		System.out.println("===========");
		Car c1=(Car)o1;//downcasting
		System.out.println(c1.a);
		System.out.println(c1.b);
		System.out.println(c1.c);
		System.out.println(c1.d);
		System.out.println("=============");
		ElectricCar e1=(ElectricCar)o1;//downcasting
		System.out.println(e1.a);
		System.out.println(e1.b);
		System.out.println(e1.c);
		System.out.println(e1.d);
		System.out.println(e1.e);
		System.out.println(e1.f);
	}

}
