package Relation;

public class Driver {
	public static void main(String[] args)
	{
		Employ e1=new Employ();
		e1.name="Mohan";
		e1.id=345;
		e1.v1.name="TATA";
		e1.v1.price=346788;
		e1.l1.name="DELL";
		e1.l1.color="Black";
		e1.f1.name="Apple";
		e1.f1.price=180;
		e1.f1.weight=1.3;
		System.out.println("EMploy name is: "+e1.name);
		System.out.println("EMploy Id is: "+e1.id);
		e1.work();
		System.out.println("======================");
		System.out.println("Vehicle name is: "+e1.v1.name);
		System.out.println("Vehicle Price is: "+e1.v1.price);
		System.out.println("Vehicle COlor is: "+e1.v1.color);
		e1.v1.run();
		System.out.println("======================");
		System.out.println("laptop name is: "+e1.l1.name);
		System.out.println("laptop Price is: "+e1.l1.price);
		System.out.println("Laptop COlor is: "+e1.l1.color);
		e1.l1.use();
		System.out.println("======================");
		System.out.println("Fruit name is: "+e1.f1.name);
		System.out.println("Fruit Price is: "+e1.f1.price);
		System.out.println("Fruit weight is: "+e1.f1.weight);
		e1.f1.eat();
	}

}
