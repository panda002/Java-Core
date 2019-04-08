package polymorphism;

public class CompileTimePoly {
	
	public int area(int a)
	{
		return a*a;
	}
	
	public int area(int a,int b)
	{
		return a+b;
	}
	
	public void area()
	{
		System.out.println("No Parameter is passed");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompileTimePoly cpt=new CompileTimePoly();
		System.out.println(cpt.area(2));
		System.out.println(cpt.area(2,4));
		cpt.area();
	}

}
