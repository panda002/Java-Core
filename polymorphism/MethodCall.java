package polymorphism;

public class MethodCall {

		public void hey()
		{
			System.out.println("This is the first method");
		}
		
		public void hey(int a)
		{
			hey();
			System.out.println("This is the second method");
			hey();
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodCall mc = new MethodCall();
		mc.hey(2);
	}

}
