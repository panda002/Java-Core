package pattern;

public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)
		{
			for(int k=1;k<=i;k++)
			{
			System.out.print(" ");	
			}
			for(int j=4;j>i;j--)
			{
			System.out.print("*");
			}
			System.out.println();
			}
	
		
	}

}
