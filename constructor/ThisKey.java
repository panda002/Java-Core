package constructor;

public class ThisKey {
	
	int a,b;
	ThisKey(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKey obj=new ThisKey(3,2);
		System.out.println(obj.a);
		System.out.println(obj.b);
}
}
