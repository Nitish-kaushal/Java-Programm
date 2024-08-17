package Abstract_class;

public class ElectricCar extends Car {
	int charge_capacity;
	ElectricCar(){
		
	}
	ElectricCar(String name, int hp, int charge_capacity)
	{
		super(name, hp);
		this.charge_capacity=charge_capacity;
	}
	public void start() {
		System.out.println("Start the electric car");
	}
	public  void stop() {
		System.out.println("Stop the electric car");
	}
	public  void openGate() {
		System.out.println("Open gate in electric car");
	}
	public void displayDetails() {
		System.out.println("Name: "+name+" HP: "+hp+" Charge capacity: "+charge_capacity);
	}
	

}
