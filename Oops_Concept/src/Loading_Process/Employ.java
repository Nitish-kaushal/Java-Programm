package Loading_Process;

public class Employ {

	static int count=0;
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
		count++;
		System.out.println("=========Main method starts========");
		System.out.println("Company name is: "+Employ.comp_name);
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
		//String[] p={"abc", "ijk"};
		if(count<5)
			e2.main(null);
		else
			System.out.println("Main method completes");
	}

}
