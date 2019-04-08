package polymorphism;

class outside
{
	public void one()
	{
		System.out.println("this is 'One' Method");
	}
}

class outside2
{
public void two()
{
	outside to=new outside();
	to.one();
	System.out.println("this is 'Two' Method");
}
}
public class MethodCallFromClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outside2 out2=new outside2();
		out2.two();
	}

}
