package inheritance;

class parent1
{
	public void a()
	{
		
	System.out.println("This is parent class method");
	
	}
}
class child1 extends parent1
{
public void a()
{
	
System.out.println("This is overridden method");
}
public void unique()
{
System.out.println("This is the unique method");
System.out.println("This is visible because we have used downcasting");
}
}

public class Upcasting {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
parent1 p=new parent1();//static binding
p.a();

parent1 p1=new child1();//dynamic binding
p1.a();					//up casting

child1 c=(child1) p1;//down casting
c.a();
c.unique();

	}

}
