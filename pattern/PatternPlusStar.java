package pattern;

public class PatternPlusStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for (i=0;i<=6;i++)
		{
			for (j=1;j<=5;j++)
			{
				if(j==3||i==3)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
				/*if(i==3)
				{
					System.out.print("2");	
				}	*/
			}
			System.out.println();

		}
	}

}
