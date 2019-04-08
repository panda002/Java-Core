package basic_programs;
import java.util.*;
public class ReverseOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,num1,rev=0;
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter the number");
		a=obj.nextInt();

		while(a!=0)
		{
			num1=a%10;
			rev=rev*10+num1;
			a=a/10;
		}		
		System.out.println("Reverse of the number is "+rev);	
	}

}