package Copy_constructor;

public class VehicleDriver {
public static void main(String[] args)
{
	Vehicle v1= new Vehicle("Car", 326657.7, "red");
	
	Vehicle v2=new Vehicle(v1);
	v1.displayVehicle();
	v2.displayVehicle();
}
}
