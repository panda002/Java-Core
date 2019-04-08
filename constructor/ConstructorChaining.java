package constructor;

public class ConstructorChaining {

	ConstructorChaining()
	{
		this(1);
		System.out.println("THREE");
	}
	ConstructorChaining(int a)
	{
		this(2,3);
		System.out.println("TWO");
	}
	ConstructorChaining(int a,int b)
	{
		System.out.println("ONE");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorChaining obj=new ConstructorChaining();
	}

}
