package Constructor;

public class Car {
static int count=0;
Car()
{
	count++;
	System.out.println("this is car Object: "+count);
	
}
public void test()
{
	System.out.println("this is test method");
}
}
