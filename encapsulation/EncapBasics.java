package encapsulation;

class encap
{
private int a;
private int b=20;
private int c=10;

//public int setA(a)
//{//
//	this.a=a;
//}
public int getA()
{
System.out.println(a);
return a;	
}
}
public class EncapBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		encap obj=new encap();
		obj.getA();
	}

}
