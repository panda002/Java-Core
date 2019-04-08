package basic_programs;
import java.util.*;
public class Pallindrome {

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
		System.out.println(rev);
		if(rev==a)
		{
			System.out.println("Number is a Pallindrome");
		}
		else
		{
			System.out.println("Number is not a Pallindrome");
		}
	}

}