import java.util.*;
public class array{
	public static void main(String args[])
	{
		int i;
		int val;
		int flag=0;
		Scanner tre = new Scanner (System.in);
		System.out.print("Enter the limit: ");
		int n = tre.nextInt();
		int a[] = new int [n];
		for(i=0;i<n;i++)
		{
			a[i] = tre.nextInt();
		}
		System.out.println("The array are: ");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.print(" ");
		System.out.print("\nEnter the value to be searched: ");
		val = tre.nextInt();
		for(i=0;i<n;i++)
		{
			if(a[i] == val)
			{
				flag=1;
			}
		}
		if(flag ==1)
		{
			System.out.print("\nValue is found.");
		}
		else
		{
			System.out.print("\nValue is not found.");
		}
	}
}