package array;

import java.util.Scanner;

public class Array_secondlargestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj = new Scanner(System.in);
		int i,n,max,secondmax=0;
		System.out.println("Enter size of the array :");
		n=obj.nextInt();
		int arr[]=new int[n];
		
		System.out.println("Enter the values for array : ");
		for(i=0;i<n;i++) {
			
			
			arr[i]=obj.nextInt();
		}
		
		max=arr[0];
		
		
		for(i=0;i<n;i++) {
			
		if(max<arr[i]) {
			
			secondmax=max;
			max=arr[i];
		}
		
		else {
			
			secondmax=arr[i];
		}
			
			
		}
		
		/*System.out.println("The greatest number is : " +max);*/
	
		System.out.println("The second greatest number is :" +secondmax);

	}

}
