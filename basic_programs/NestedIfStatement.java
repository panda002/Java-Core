package basic_programs;

public class NestedIfStatement 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num1 = 10, num2 = 20;
		if (num1 < num2) {// greater than condition
			if (num1 < num2/2) {// equal condition
				System.out.println("num1 is less than half of num2");
			}
			else 
			{
				System.out.println("num1 is not less than half of num2");
			}
		} 
		else 
		{
			System.out.println("num1 is not less than half of num2");
		}
	}

}