package static_concepts;

class static1
{
int a=10;
static int b = 30;
}


public class Static_basics1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		static1 a=new static1();
		System.out.println(a.a);
		System.out.println(static1.b);
	}

}
