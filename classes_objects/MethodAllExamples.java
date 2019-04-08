package classes_objects;
import java.util.Scanner;

public class MethodAllExamples {

	static int a;
	static int b;
	int c;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter the number");
		a=obj.nextInt();
		b=obj.nextInt();
		MethodAllExamples obj1=new MethodAllExamples();
		System.out.println("Sum of the number entered is : "+obj1.add());
		obj1.sub();
		System.out.println("Product of the number entered is : "+obj1.mul(3,2));
	}

	public int add()
	{
		c=a+b;
		return c;
	}
	public void sub()
	{
		c= a-b;
		System.out.println("Result of subsctraction is :"+c);
	}
	public int mul(int a,int b)
	{
		c=a*b;
		return c;
	}
}
