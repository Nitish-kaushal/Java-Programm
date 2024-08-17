package upcasting_downcasting;

public class Driver {
	public static void main(String[] args) {
		Object o1=new ElectricCar();
		Vehicle v1	 =new ElectricCar();
		System.out.println(v1.a);
		System.out.println(v1.b);
		System.out.println("===================");
	
	 	Car c1=	new ElectricCar();
	 	System.out.println(c1.a);
	 	System.out.println(c1.b);
	 	System.out.println(c1.c);
	 	System.out.println(c1.d);
	 	ElectricCar e1=new ElectricCar();
	 	
}

}
