package inheritance;


class Base1
{
	public void base()
	{
		System.out.println("This is base class");
	}
}

class derive1 extends Base1
{
	public void base()
	{
		super.base();
		System.out.println("This is the derived class");
	}

}

public class SuperMethod {

	public static void main(String[] args) {
		derive1 s=new derive1();
		s.base();

	}

}
