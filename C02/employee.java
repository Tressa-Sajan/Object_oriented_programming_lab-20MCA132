//8. Program to create a class for Employee having attributes eNo, eName eSalary. Read n
//employ information and Search for an employee given eNo, using the concept of Array of
//Objects.
import java.util.*;
class employee{
	int eno;
	String n;
	int p;
	void get()
	{
		Scanner tre=new Scanner(System.in);
		System.out.print("Enter the NO: ");
		eno=tre.nextInt();
		System.out.print("Enter the Name: ");
		n=tre.next();
		System.out.print("Enter the price: ");
		p=tre.nextInt();
		System.out.println(" ");
		
		
	}
	void put()
	{
		System.out.println("NO:"+eno);
		System.out.println("NAME:"+n);
		System.out.println("PRICE:"+p);	
	}
	public static void main(String args[])
	{
		Scanner tre=new Scanner(System.in);
		int i,limit,val;
		System.out.print("\nEnter the limit: ");
		limit=tre.nextInt();
		employee e[]=new employee[limit];
		System.out.println(" ");
		for(i=0;i<limit;i++)
		{
			System.out.println(" ");
			System.out.println("ENTER THE DEATAILS OF EMPLOYEE: "+(i+1));
			e[i]=new employee();
			e[i].get();
		}
		for(i=0;i<limit;i++)
		{
			System.out.println(" ");
			System.out.println("DEATAILS OF EMPLOYEE: "+(i+1));
			e[i].put();
		}
		System.out.println(" ");
		System.out.println("****Enter the value to be search**** ");
		val=tre.nextInt();
		for(i=0;i<limit;i++)
		{
			if(e[i].eno==val){
				e[i].put();
				break;
			
		}
			else{
				System.out.println("INVALID EMPLOYEE NO :) ");
			}
		}
	}
}