package Static_non_Static;

public class Employ {
	static int x=35;
	int y=60;
public static void test()
{
	System.out.println("This is static test method");
	System.out.println(x);
	demo();
	Employ e=new Employ();
	System.out.println(e.y);
	e.talk();
}
public static void demo()
{
	System.out.println("This is static demo method");
	
}
public void work()
{
	System.out.println("This is non static work method");
	System.out.println(y);
	talk();
	System.out.println(x);
	demo();
}
public void talk()
{
	System.out.println("This is non static talk method");
}

public static void main(String[] args)
{
	test();
	System.out.println("=========================");
	Employ e1=new Employ();
	System.out.println(e1.y);
	e1.talk();
	System.out.println("=====work method execution======");
	e1.work();
}		

}
