
// 5.Program to Sort strings

import java.util.*;
public class string{
	public static void main(String[] args)
	{
		Scanner tre=new Scanner(System.in);
		int i,j;
		String temp;
		System.out.println("Enter the no:of strings:");
		int n=tre.nextInt();
		String a[]=new String[n];
		System.out.println("Enter the  strings:");
		for(i=0;i<n;i++)
		{
			a[i]=tre.nextLine();
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i].compareTo(a[j])>0)
				{
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
				}
			}
		}
		System.out.println("sorted string array is:");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
}
		