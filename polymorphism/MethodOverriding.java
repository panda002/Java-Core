package polymorphism;


class mom1
{
	private void a()
	{
		System.out.println("THIS IS PARENT CLASS METHOD");
		
	}
}

class son1 extends mom1
{
public void a()
{
System.out.println("THIS IS CHILD CLASS OVERRIDDEN METHOD");	
	
}
public void b()

{
System.out.println("THIS IS CHILD CLASS 2nd METHOD");	
	
}

}

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
son1 s=new son1();
s.a();
s.b();
	}

}
