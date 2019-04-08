package constructor;
import java.util.Scanner;

public class Areas {
	
	
	Areas(double rad) 
	
	{
		
		System.out.println("The area is :"+(3.14*rad*rad));
		
	}
	
	Areas (double ht,double bas) 
	
	{
		
		
		System.out.println("The area is :"+((1*ht*bas)/2));
		
		
	}
	Areas(int side) {
		
		
		System.out.println("The area is :"+(side*side));
		
		
	}
	
	Areas(int l,int b) {
		
		int ar=l*b;
		System.out.println("The area is :"+ar);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	int choice;
		System.out.println("1.Circle" + "\n" +"2.Triangle"+"\n"+"3.Square"+"\n"+"4.Rectangle");
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter your choice ");
		choice=obj.nextInt();
		
		switch(choice) {
		case 1: 
			
			{
			System.out.println("Enter the radius of the circle ");
			double dim1=obj.nextDouble();
			Areas cons=new Areas(dim1);
			break;
			}
			
			
		case 2:
			
		{
			System.out.println("Enter the height and base of the triangle ");	
		
		double height=obj.nextDouble();
		double base=obj.nextDouble();
		Areas cons=new Areas (height,base);
		
		break;
		
		}
		
		case 3:
			
		{
			System.out.println("Enter the side of the square ");
		
		int side=obj.nextInt();
		Areas cons=new Areas(side);
		
		break ;
		}
		
		
		case 4: 
			
		{
			System.out.println("Enter the length and breadth of the rectangle ");
		
		int len=obj.nextInt();
		int brd=obj.nextInt();
		Areas cons=new Areas(len,brd);
		
		break;
		
		}
		
		case 5:System.out.println("Invalid choice");
		}

	}

}
