package pattern;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<6;i++)
		{
			
			for(int j=1;j<=6;j++)
			{
				if((i==1&&j==3)||(i==2&&(j==2||j==4))||(i==3&&(j==1||j==5))||(i==4&&(j==2||j==4)))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
