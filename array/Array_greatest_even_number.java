package array;

import java.util.Scanner;

public class Array_greatest_even_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj = new Scanner(System.in);
		int i,n,maxeven=0;
		System.out.println("Enter size of the array :");
		n=obj.nextInt();
		int arr[]=new int[n];
		
		System.out.println("Enter the values for array : ");
		for(i=0;i<n;i++) {
			
			
			arr[i]=obj.nextInt();
		}
		
		
		for(i=0;i<n;i++) {
			
			if(arr[i]%2==0) {
		
			
			if(maxeven<arr[i]) {
				
				maxeven=arr[i];
			}

	}

}
		
		System.out.println("The greatest even number is : " +maxeven);
	}
}
