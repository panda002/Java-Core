package basic_programs;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,factorial = 1;
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter the number");
		a=obj.nextInt();
		for(int i=1;i<=a;i++)
		{
			factorial=factorial*i;

		}
		System.out.println("Factorial of "+a+" is "+factorial);
	}

}
