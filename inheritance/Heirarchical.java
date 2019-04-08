package inheritance;
import java.util.*;

class dad
{
	int a,b;
	public void get()
	{
	System.out.println("Enter two numbers");
	Scanner obj=new Scanner(System.in);
	a= obj.nextInt();
	b= obj.nextInt();
	}
}

class Ramesh extends dad
{
	public void mul()
	{
		System.out.println("This is 1st child");
		System.out.println("This product is : "+(a*b));		
		System.out.println("");
	}
	
}

class Ram extends dad
{
	public void add()
	{
		System.out.println("This is 2nd child");
		System.out.println("This sum is : "+(a+b));
		System.out.println("");
	}
}

class Shyam extends dad
{
	public void sub()
	{
		System.out.println("This is 3rd child");
		System.out.println("This sub is : "+(a-b));
		System.out.println("");
	}
}

public class Heirarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ramesh obj1=new Ramesh();
		obj1.get();
		obj1.mul();
		
		Ram obj2=new Ram();
		obj2.get();
		obj2.add();
		
		Shyam obj3=new Shyam();
		obj3.get();
		obj3.sub();
	}

}
