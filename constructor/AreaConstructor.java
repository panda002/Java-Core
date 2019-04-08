package constructor;
import java.util.Scanner;
public class AreaConstructor {

	AreaConstructor(float a)
	{
		System.out.println("Area of the circle is :"+(3.14*a*a));
	}

		AreaConstructor(int a,int b)
	{
		System.out.println("Area of rectange is :"+(a*b));
	}
		AreaConstructor(int c)
	{
		System.out.println("Area of Square is "+(c*c));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter option for the area");
		System.out.println("1-Circle");
		System.out.println("2-Rectangle");
		System.out.println("3-Square");
		Scanner obj=new Scanner(System.in);
		int c=obj.nextInt();

		switch(c)
		{
		case 1:
		{
		System.out.println("Enter the Radius :");
		int a=obj.nextInt();
		AreaConstructor cons=new AreaConstructor(a);
		break;
		}
		case 2:
		{
			System.out.println("Enter the length and Breadth :");
			int d=obj.nextInt();
			int b=obj.nextInt();
			AreaConstructor cons=new AreaConstructor(d,b);
			break;
			}	
		case 3:
		{
			int e=obj.nextInt();
			System.out.println("Enter the Side :");
			AreaConstructor cons=new AreaConstructor(e);
			break;
			}
		
	}

}
}

