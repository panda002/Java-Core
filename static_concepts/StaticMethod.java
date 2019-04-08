package static_concepts;

class A
{
	int a=10;
	static int b=20;
	public void show()
	{
		System.out.println("Instance method");
		System.out.println(a);
		System.out.println(b);
	}
	public static void print()
	{
		A sm=new A();
		System.out.println("Static method");
		System.out.println(sm.a);
		System.out.println(b);
	}
}
public class StaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A sm= new A();
		A.print();
		sm.show();
	}

}
