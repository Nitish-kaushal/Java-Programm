package Abstract_class;

public class Driver {
	public static void main(String[] args) {
		Car c1=new ElectricCar("Tesla", 180, 440);
		System.out.println("=====================");
		c1.start();
		c1.openGate();
		c1.stop(); 
		((ElectricCar)c1).displayDetails();
	}

}
