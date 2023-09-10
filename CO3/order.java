//Prepare a bill with the given format using the calculate method from the interface.  
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

	String name;
	int n,id,qy,price,total;
	public void get()
	{
		Scanner a=new Scanner(System.in);
		System.out.print("\nEnter product id: ");
		id=a.nextInt();
		System.out.print("Enter product name: ");
		name=a.next();
		System.out.print("Enter the quantity: ");
		qy=a.nextInt();
		System.out.print("Enter the unit price for the product: ");
		price=a.nextInt();
	}
	
	public void cal()
	{
	 total=price*qy;
	}
	public void display()
	{
		System.out.print(id+ "\t\t" +name+"\t" +qy+"\t\t" +price+"\t" +total+"\n");
	}
	public static void main(String[] args)
	{
		String date;
		int i,n,ord;
	Scanner a=new Scanner(System.in);
	System.out.print("\nEnter order no: ");
	ord=a.nextInt();
	System.out.print("Enter date: ");
	date=a.next();
	System.out.print("Enter the number of ordered products: ");
	n=a.nextInt();
	order odd[]=new order[n];
	for(i=0;i<n;i++)
	{
		odd[i]=new order();
		odd[i].get();
		odd[i].cal();
	}
	System.out.println("-----------------------------Bill-----------------------------");
	System.out.println("Order: "+ord);
	System.out.println("Date: "+date);
	System.out.println("--------------------------------------------------------------");
	System.out.println("PRODUCT ID \tNAME  \t\tQuantity  Unit price \tTotal");
	for(i=0;i<n;i++)
	{
		odd[i].display();
	}
	System.out.println("\n--------------------------------------------------------------");
	}
	
}
