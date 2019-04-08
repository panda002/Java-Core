package array;

import java.util.Scanner;

public class ArraySwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj = new Scanner(System.in);
		int i,j,n,temp;
		System.out.println("Enter size of the array :");
		n=obj.nextInt();
		int arr[]=new int[n];
		
		System.out.println("Enter the values for array : ");
		for(i=0;i<n;i++) {
			
			
			arr[i]=obj.nextInt();
		}
		
		for(i=0;i<n;i++) {
			
			for(j=i+1;j<n;j++) {
				
				if (arr[i]>arr[j]) {
					
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		
System.out.println("The elements of the array after sorting are :");
		
		for(i=0;i<n;i++) {
			
			  System.out.print(" " +arr[i] );
		}
		

	}

}
