package array;

import java.util.Scanner;


public class Array_user_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int i;
		int arr[]=new int[5];
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the values for array : ");
		for(i=0;i<arr.length;i++) {
			
			
			arr[i]=a.nextInt();
		}
		
		System.out.println("The elements of the array are :");
		
		for(i=0;i<arr.length;i++) {
			
			  System.out.print(" " +arr[i] );
		}

	}

}
