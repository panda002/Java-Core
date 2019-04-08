package basic_programs;
import java.util.*;
public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter a number between 1 and 3");
		a=obj.nextInt();
		
		switch(a)
		{
		case 1: case 4:
			System.out.println("You have entered ONE");
			break;
		case 2:
			System.out.println("You have entered TWO");
			break;
		case 3:
			System.out.println("You have entered THREE");
			break;
			default:
				System.out.println("Please enter the number between the given range");
		}
		
	}

}
