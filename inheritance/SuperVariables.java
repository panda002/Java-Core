package inheritance;


class base2
{

	int a =10;
}
class der extends base2
{
public void a()	
{
	int a = 20;
	System.out.println("This is the child class menthod variable value : "+a);
	System.out.println("This is the parent class menthod variable value using super keyword : "+super.a);
}
}

public class SuperVariables {

	public static void main(String[] args) {
		der d=new der();
		d.a();

	}

}
