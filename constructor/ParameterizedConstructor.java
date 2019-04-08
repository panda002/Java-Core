package constructor;
import java.util.Scanner;
public class ParameterizedConstructor {
	
	ParameterizedConstructor(int num1,int num2)
	{
		System.out.println("The sum of the parameters passed is :"+(num1+num2));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter the number to add: ");
		int num1=obj.nextInt();
		int num2=obj.nextInt();
		
		ParameterizedConstructor a=new ParameterizedConstructor(num1,num2);

		
	}

}
