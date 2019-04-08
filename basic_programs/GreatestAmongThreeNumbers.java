package basic_programs;

public class GreatestAmongThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1=1, num2=1, num3=1;
		
		if (num1>num2)
		{
			if (num2>num3)
			{
			if (num1>num3)
			{
				System.out.println("Num1 is the greatest");
			}
			}
		}
		else if (num2>num3)
		{
			System.out.println("Num2 is the greatest");		
		}
		if(num3>num2)
		{
			System.out.println("Num3 is the greatest");		
		}
		if (num1==num2)
		{
			if (num2==num3)
			{
				System.out.println("All are EQUAL");
			}
		}
	}
}
