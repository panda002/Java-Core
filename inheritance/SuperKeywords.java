package inheritance;

class base
{
base(int a)
{
System.out.println("pikka pikka - This is Base class - pikka pikka \n"+a);	
}
}

class derive extends base
{
derive()
{
super(5);
System.out.println("pikkaaa - this is the derived class- pikkaaaa");	
}
}

public class SuperKeywords {

	public static void main(String[] args) {
		derive d = new derive();

	}

}
