package constructor;

public class AnonymousBlock {

	{
		System.out.println("Hello there\n");
	}
	
	{
		System.out.println("Hello there 2nd time\n");
	}
	
	AnonymousBlock()
	{
		System.out.println("Inside constructor ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnonymousBlock obj=new AnonymousBlock();
	}

}
