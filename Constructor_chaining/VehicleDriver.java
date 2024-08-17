package Constructor_chaining;

public class VehicleDriver {
public static void main(String[] args)
{
	Vehicle v1=new Vehicle("TATA",325667.6, "white");
	Vehicle v2=new Vehicle("Bike",25667.6, "Red");
	v1.displayVehicle();
	v2.displayVehicle();
	
	Vehicle v3= new Vehicle();
	v3.displayVehicle();
	
	Vehicle v4= new Vehicle("Bus");
	v4.displayVehicle();
	
	Vehicle v5=new Vehicle("Truck", 3464577.78,"red");
	v5.displayVehicle();
	
	Vehicle v6=new Vehicle("Train", 34654777.67, "blue", 1234, 100);
	v6.displayVehicle();
}
}
