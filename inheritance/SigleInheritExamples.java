package inheritance;
import java.util.*;

class Parent1
{
	int a,b;
 public void get()
 {
		
		Scanner obj1=new Scanner(System.in);
		System.out.println("enter numbers to add");
		b=obj1.nextInt();
		a=obj1.nextInt();
		System.out.println("This is the parent");
 }
}

class Child1 extends Parent1
{
 public void add()
 {
	 System.out.println("This is the child and the sum is :"+(a+b));
 }
}

public class SigleInheritExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child1 obj=new Child1();
		obj.get();
		obj.add();
	}

}
