
// 6. Search an element in an array.

import java.util.*;
public class Array{
	
	public static void main(String[] args){
	Scanner tre=new Scanner(System.in);
	
	int i;
	int val;
	int flag=0;
	System.out.print("\nEnter the size of the array: ");
	int n=tre.nextInt();
	int a[]=new int[n];
	System.out.println("\nEnter the elements: ");
	for(i=0;i<n;i++)
	{
		a[i]=tre.nextInt();
	}
	
	System.out.println("\nArray Elements are: ");
		for( i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println(" ");
		System.out.print("\nEnter the value to be search: ");
		val=tre.nextInt();
		for(i=0;i<n;i++)
		{
			if(a[i]==val)
			{
				flag=1;
			
			}
		}
		
		if(flag==1)
		{
			System.out.println("\nvalue found.");
			
		}
		else{
			System.out.println("\nvalue is not found.");
		}
		
	}
	
}