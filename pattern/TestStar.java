package pattern;

public class TestStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0;i<4;i++)
		{
			for(int k=0;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(int j=3;j>=1;j--)
			
			{
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
			
		}
	}

}
