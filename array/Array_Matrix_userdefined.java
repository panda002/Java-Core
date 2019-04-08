package array;

import java.util.Scanner;

public class Array_Matrix_userdefined {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj = new Scanner(System.in);
		int i,j,n1,n2;
		System.out.println("Enter size of the array :");
		n1=obj.nextInt();
		n2=obj.nextInt();
		
		int arr[][]=new int[n1][n2];
		

		System.out.println("Enter the values for array : ");
		for(i=0;i<n1;i++) {
			for(j=0;j<n2;j++) {
				
			
			arr[i][j]=obj.nextInt();
		}
		

	}
		
for(i=0;i<n1;i++) {
			
			for(j=0;j<n2;j++) {
				
				
				System.out.print(" "+arr[i][j]+"    ");
			}
			
			System.out.println();

	}

}
}
