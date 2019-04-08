package static_concepts;

class static2
{
int a;
static int b;
}
public class Static_Memory_MNGMNT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Memory Management Using Static\n");
		static2 a=new static2();
		static2 a1=new static2();
		static2 a2=new static2();
		a.a=10;
		a1.a=20;
		a2.a=30;
		System.out.println(a.a);
		System.out.println(a1.a);
		System.out.println(a2.a);
		
		System.out.println();
		
		a.b=10;
		a1.b=20;
		a2.b=30;
		System.out.println(a.b);
		System.out.println(a1.b);
		System.out.println(a2.b);
		
		
	}

}
