package inheritance;

import java.util.*;

class mom
{
	int a;
	Scanner s=new Scanner(System.in);
	
public void get()
{
System.out.println("Enter 1st number");	
a=s.nextInt();
}

}
class dad1
{
	int b;
	Scanner s1=new Scanner(System.in);
	
public void num()
{
System.out.println("Enter 2nd number");	
b=s1.nextInt();
}

}

class sid extends mom 
{
public void sum()
{
//System.out.println("The sum is :"+(a+b));	
}
}

public class Multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stubs
		sid obj=new sid();
		obj.get();
		
	}

}
