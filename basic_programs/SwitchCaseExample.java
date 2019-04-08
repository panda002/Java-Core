package basic_programs;
import java.util.*;
public class SwitchCaseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter two numbers");
		a=obj.nextInt();
		System.out.println("Enter Another");
		b=obj.nextInt();
		
		System.out.println("Enter Operation to perform");
		System.out.println("1-Addition");
		System.out.println("2-Substraction");
		System.out.println("3-Multiplication");
		System.out.println("4-Division");
		c=obj.nextInt();
		switch(c)
		{
		case 1:
			System.out.println("Sum is "+(a+b));
			break;
		case 2:
			System.out.println("Substraction is "+(a-b));
			break;
		case 3:
			System.out.println("Product is "+(a*b));
			break;
		case 4:
			System.out.println("Division is "+(a/b));
			break;
			default:
				System.out.println("Please enter the number between the given range");
		}
		
	}

}
