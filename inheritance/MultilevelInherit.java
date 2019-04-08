package inheritance;

import java.util.*;

class Grandpa
{
	int a,b;
 public void get()
 {
	 	System.out.println("This is the GrandParent");
		Scanner obj1=new Scanner(System.in);
		System.out.println("enter numbers");
		b=obj1.nextInt();
		a=obj1.nextInt();
		
 }
}

class Papa extends Grandpa
{
 public void mul()
 {
	 System.out.println("This is the Parent and the product is :"+(a*b));
 }
}

class Sidharth extends Papa
{
 public void add()
 {
	 System.out.println("This is Son and the sum is :"+(a+b));
 }
}



public class MultilevelInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sidharth obj=new Sidharth();
		obj.get();
		obj.mul();
		obj.add();
	}
	}

