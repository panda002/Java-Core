package pattern;

public class RhombusStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0;i<4;i++)
		{
			for(int k=2;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			
			{
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
			
		}
		for(int i=0;i<4;i++)
		{
			for(int k=0;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(int j=2;j>=i;j--)
			
			{
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
			
		}
	}

}
