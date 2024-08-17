package Abstract_class;

public abstract class Vehicle {
	static {
		System.out.println("Static block of vehicle");
	}
	{
		System.out.println("Non-static block of Vehicle");
	}
	String name;
	public abstract void start();
	public abstract void stop();
	
	public void test() {
		System.out.println("Test vehicle");
	}
	public void applyBreak() {
		System.out.println("Apply Break invehicle");
	}
	Vehicle(){
		
	}
	Vehicle(String name){
		this.name=name;
	}
	

}
