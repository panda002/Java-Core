package inheritance;

class Base2
{
	public void A()
	{
	System.out.println("This is Parent class");
	}
}
class Derive2 extends Base2
{
	public void A()
	{
		super.A();
		System.out.println("This is Overridden method in Child class");
	}
	public void derive()
	{
		System.out.println("This is individual method");
	}
}
public class SuperExample2 {

	public static void main(String[] args) {
	Derive2 obj=new Derive2();
	obj.A();
	}

}
