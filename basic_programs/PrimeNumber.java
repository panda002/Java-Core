package basic_programs;
import java.util.*;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,num1,i;
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter the number");
		a=obj.nextInt();

		for(i=2;i<a;i++)
		{
			num1=a%i;
			if(num1==0)
				break;
		}
		if(i==a)
		{	
			System.out.println("The number is Prime");
		}
		else
		{
			System.out.println("The number is not Prime");
		}
	}
}

