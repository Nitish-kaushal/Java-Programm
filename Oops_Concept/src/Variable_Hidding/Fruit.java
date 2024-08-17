package Variable_Hidding;

public class Fruit {
	int x=35;
	public  void demo()
	{
		System.out.println("This is non static demo method");
		int x=50;
		System.out.println("Local x: "+x);
		System.out.println("non static x: "+this.x);
	}
	
	public static void main(String[] args)
	{
		Fruit f1=new Fruit();
		f1.demo();
	}		

}
