package Constructor;

public class VehicleDriver {
public static void main(String[] args)
{
	Vehicle v1= new Vehicle("TATA", 325667.6);
	Vehicle v2= new Vehicle("Bike", 25667.6, "Red",10);
	v1.displayVehicle();
	v2.displayVehicle();
	
	Vehicle v3=new Vehicle();
	v3.displayVehicle();
	
	Vehicle v4=new Vehicle();
	v4.displayVehicle();
	
	
	Vehicle v5=new Vehicle();
	v5.displayVehicle();
}
}
