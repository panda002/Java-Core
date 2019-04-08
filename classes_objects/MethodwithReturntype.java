package classes_objects;

public class MethodwithReturntype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodwithReturntype obj=new MethodwithReturntype();
		int sum=obj.add();
		System.out.println("GRE score is : "+sum);
		
	}

	public int add()
	{
		int a=10,b=310,c;
		c=a+b;
		return c;
	}
		
}
