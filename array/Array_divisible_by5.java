package array;

import java.util.Scanner;

public class Array_divisible_by5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner obj = new Scanner(System.in);
		int i,n;
		System.out.println("Enter size of the array :");
		n=obj.nextInt();
		int arr[]=new int[n];
		
		System.out.println("Enter the values for array : ");
		for(i=0;i<n;i++) {
			
			
			arr[i]=obj.nextInt();
		}
		
		System.out.println("The elements of array divisible by 5 are : ");
		
		for(i=0;i<n;i++) {
			
			if(arr[i]%5==0) {
				
				System.out.println(" "+arr[i]);
			}
		}
		
		
		
		
	}

}
