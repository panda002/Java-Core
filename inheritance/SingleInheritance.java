package inheritance;

class Parent
{
 public void car()
 {
	 System.out.println("This is the parent");
 }
}

class Child extends Parent
{
 public void flat()
 {
	 System.out.println("This is the child");
 }
}


public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj=new Child();
		obj.car();
		obj.flat();
	}

}
