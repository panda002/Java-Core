package classes_objects;

public class MethodwithReturntypeandParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Example of MethodwithReturntypeandParameter");
		MethodwithReturntypeandParameter obj=new MethodwithReturntypeandParameter();
		System.out.println("The sum is "+obj.add(1,159));
		

}
public int add(int a,int b)
{
int c= a+b;
return c;
}
}