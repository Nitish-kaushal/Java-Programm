package Static_block;

public class Fruit {
	static int x;
	static {
		System.out.println("static block-1 and x is: "+x);
		x=24;
	}
	
	public static void main(String[] args) {
		System.out.println("This is main method");
	}
	
	static {
		System.out.println("static block-2 and x is: ");
	}

}
