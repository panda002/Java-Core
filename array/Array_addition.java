package array;

import java.util.Scanner;

public class Array_addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj = new Scanner(System.in);
		int i,j,n1,n2,n3,n4,n5,n6;
		System.out.println("Enter size of the array1 :");
		n1=obj.nextInt();
		n2=obj.nextInt();
		System.out.println("Enter size of the array2 :");
		n3=obj.nextInt();
		n4=obj.nextInt();
		System.out.println("Enter size of the array3 :");
		n5=obj.nextInt();
		n6=obj.nextInt();
		
		
		int arr1[][]=new int[n1][n2];
		int arr2[][]=new int[n3][n4];
		int arr3[][]=new int[n5][n6];

		
		
		System.out.println("Enter the values for array1 : ");
		for(i=0;i<n1;i++) {
			for(j=0;j<n2;j++) {
				
			
			arr1[i][j]=obj.nextInt();
		}}
			
			System.out.println("Enter the values for array2 : ");
			for(i=0;i<n3;i++) {
				for(j=0;j<n4;j++) {
					
				
				arr2[i][j]=obj.nextInt();
			}}
			
			
			System.out.println("The array3 is : ");	
			for(i=0;i<n3;i++) {
				for(j=0;j<n4;j++) {
					
					
					arr3[i][j]=arr2[i][j]+arr1[i][j];
					
				}}
			
			
			for(i=0;i<n5;i++) {
				
				for(j=0;j<n6;j++) {
						
					System.out.print(" "+arr3[i][j]+"    ");
				}
				
				System.out.println();
		}	

	}

}
