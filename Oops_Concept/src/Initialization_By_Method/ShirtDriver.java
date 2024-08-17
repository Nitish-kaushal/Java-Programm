package Initialization_By_Method;

public class ShirtDriver {
	public static  void main(String[] args)
	{
		Shirt s1=new Shirt();
		Shirt s2=new Shirt();
		Shirt s3=new Shirt();

		s1.setValue("Peter england", 38, 1234.5);
		s2.setValue("Blackberry", 42, 3210.3);
		s3.setValue("Van Heusen", 40, 3456.3);

		s1.displayDetails();
		s2.displayDetails();
		s3.displayDetails();
	}
			

}
