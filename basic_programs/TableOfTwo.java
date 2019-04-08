package basic_programs;
import java.util.*;
public class TableOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter the number");
		a=obj.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(a+" * "+i+" = "+(a*i));
		}

	}

}
