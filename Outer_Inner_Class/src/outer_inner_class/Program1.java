package outer_inner_class;

public class Program1 {
	public static void main(String[] args)
	{
		int x=320;
		int num=x;
		int digit1=x%10;
		x=x/10;
		int digit2=x%10;
		x=x/10;
		int digit3=x%10;
		int sum=digit1+digit2+digit3;
		System.out.println("The Number is: "+num);
		System.out.println("Sum of its digit is: "+sum);
	}
}
