package inheritance;

class P
{
	public P a()
	{
		System.out.println("This returns P from parent class");
		return new P();
	}
}

class S extends P
{
	public S a()
	{
		System.out.println("This returns S from child class");
		return new S();
	}

}

public class CoVariants {

	public static void main(String[] args) {
		S obj=new S();
		obj.a();

	}

}
