import java.util.*;
interface bill
{
	public void get();
}
interface calculate
{
	public void cal();
}
class order implements bill,calculate
{
	String n;
	int id,q,up,tot;
	public void get()
	{
		
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the product id: ");
		id = a.nextInt();
		System.out.println("Enter the name: ");
		n = a.next();
		System.out.println("Enter the Quantity: ");
		q = a.nextInt();
		System.out.println(" Enter the unit prize: ");
		up = a.nextInt();
		
	}
	public void cal()
	{
		tot=up*q;
	}
	public void display()
	{
		System.out.print(id+"\t\t"+n+"\t\t"+q+"\t\t"+up+"\t\t"+tot+"\n");
	}
	public static void main(String args[])
	{
		String date;
		int ord,n,i;
		Scanner a = new Scanner(System.in);
		System.out.println("Enter order no: ");
		ord= a.nextInt();
		System.out.println("Enter the date: ");
		date = a.next();
		System.out.println("Enter the no of orderd prdouct: ");
		n = a.nextInt();
		order odd[]=new order[n];
		for(i=0;i<n;i++)
		{
			odd[i]=new order();
			odd[i].get();
			odd[i].cal();
		}
		System.out.println("-----------------------Bill-------------------------");
	    System.out.println("order:"+ord);
	    System.out.println("Date:"+date);
	    System.out.println("---------------------------------------------------");
	    System.out.println("PRODUCT ID \tNAME  \tQuantity  Unit price \tTotal");
	    for(i=0;i<n;i++)
	    {
		odd[i].display();
	    }
	    System.out.println("\n---------------------------------------------------");
	}
}
