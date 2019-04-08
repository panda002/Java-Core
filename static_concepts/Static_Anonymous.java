package static_concepts;

public class Static_Anonymous {

	static{
		System.out.println("Anonymous Block");
	}
	
	{
		System.out.println("Ooooooo");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Static_Anonymous obj=new Static_Anonymous();
		Static_Anonymous obj1=new Static_Anonymous();
		Static_Anonymous obj2=new Static_Anonymous();
	}

}
