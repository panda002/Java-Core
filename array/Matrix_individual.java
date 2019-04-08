package array;

public class Matrix_individual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][]=new int[3][3];
		arr[0][0]=2;
		arr[0][1]=9;
		arr[0][2]=31;
		
		arr[1][0]=3;
		arr[1][1]=10;
		arr[1][2]=32;
		
		arr[2][0]=4;
		arr[2][1]=11;
		arr[2][2]=33;
		
		System.out.println("The matrix is : \n" +arr[0][0]+" "+arr[0][1]+" "+arr[0][2]+"\n"+arr[1][0]+
				" "+arr[1][1]+" "+arr[1][2]+"\n"+arr[2][0]+" "+arr[2][1]+" "+arr[2][2] );
		
		/*for(int i=0;i<3;i++) {
			
			for(int j=0;j<3;j++) {
				
				
				System.out.print(arr[i][j]+" ");
			}
			
			System.out.println();
		}*/

		
		
		

	}

}
