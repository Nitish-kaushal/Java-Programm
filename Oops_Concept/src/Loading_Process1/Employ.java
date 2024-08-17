package Loading_Process1;

public class Employ {
	static String comp_name="ABC Pv t. Ltd";
	String emp_name;
	int id;
	public static void giveBiometric()
	{
		System.out.println("EMploy should give biometric");
	}
	public void work()
	{
		System.out.println("Employ is working");
	}
	public static void main(String[] args)
	{
		int x=34;
		System.out.println("=========Main method starts========");
		System.out.println("Company name is: "+comp_name);
		Employ.giveBiometric();	
		Employ e1=new Employ();
		Employ e2=new Employ();
		Employ e3=new Employ();
		System.out.println("====Details of EMploy1 before initialization====");
		System.out.println("Company Name is: "+e1.comp_name);
		System.out.println("Employ Name is: "+e1.emp_name);
		System.out.println("EMploy ID is: "+e1.id);
		e1.giveBiometric();
		e1.work();
		e1.emp_name="Mohan";
		e1.id=123;
		e2.emp_name="Sohan";
		e2.id=128;
		e3.emp_name="Rohan";
		e3.id=153;


		e2.emp_name="Jethalal Ji";
		e3.comp_name="Jetahlal Shipping Pvt Ltd";

		System.out.println("====Details of EMploy1 After initialization====");
		System.out.println("Company Name is: "+e1.comp_name);
		System.out.println("Employ Name is: "+e1.emp_name);
		System.out.println("EMploy ID is: "+e1.id);
		e1.giveBiometric();
		e1.work();
		System.out.println("====Details of EMploy2 After initialization====");
		System.out.println("Company Name is: "+e2.comp_name);
		System.out.println("Employ Name is: "+e2.emp_name);
		System.out.println("EMploy ID is: "+e2.id);
		e2.giveBiometric();
		e2.work();
		System.out.println("====Details of EMploy3 After initialization====");
		System.out.println("Company Name is: "+e3.comp_name);
		System.out.println("Employ Name is: "+e3.emp_name);
		System.out.println("EMploy ID is: "+e3.id);
		e3.giveBiometric();
		e3.work();
	}		

}
