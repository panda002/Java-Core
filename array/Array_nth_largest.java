package array;

import java.util.Scanner;

public class Array_nth_largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj = new Scanner(System.in);
		int i,j,n,temp,nth;
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
		
	System.out.println("Enter the nth largest number that you want : ");
	
	nth=obj.nextInt();
	
	System.out.println("The required "  +nth+  " largest number is : " +arr[n-nth]);
		

	}

}
