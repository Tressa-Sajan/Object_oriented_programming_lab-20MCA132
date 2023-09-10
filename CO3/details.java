//4,12.Write a program has class Publisher, Book, Literature and Fiction. Read the information 
//and print the details of books from either the category, using inheritance.

import java.util.*;
class publisher
{
String nam;
 	
	void publisher()
	{
	Scanner a=new Scanner(System.in);
	System.out.print("Enter publisher name:");
	 nam=a.next();
	}
}
class book extends publisher
{	
	String tit,auth,pric;
	int price;
	void book()
	{
	Scanner a=new Scanner(System.in);
	System.out.print("Enter book title:");
	tit=a.next();
	System.out.print("Enter author name:");
	auth=a.next();
	System.out.print("Enter book price:");
	price=a.nextInt();
	}
}
class fiction extends book
{
	void fiction()
	{	
		System.out.println("Publisher Name:"+nam);
		System.out.println("Book Name:"+tit); 
		System.out.println("Author Name: "+auth);
		System.out.println("Price: "+pric);
	}
	
}
class literature extends book
{
	void literature()
	{
		System.out.println("\n\nPublisher Name:"+nam);
		System.out.println("Book Name:"+tit); 
		System.out.println("Author Name: "+auth);
		System.out.println("Price: "+pric);
	}
	
}
class details
{
	public static void main(String[] args)
	{
		int i;
	Scanner a=new Scanner(System.in);
	System.out.print("\nEnter no of entries:");
	int n=a.nextInt();
	fiction dd[]=new fiction[n];
	for(i=0;i<n;i++)
	{
		System.out.println("Details of fiction book "+(i+1));
		dd[i]=new fiction();
		dd[i].publisher();
		dd[i].book();
	}
	for(i=0;i<n;i++)
	{
		System.out.println("\nDetails of fiction book "+(i+1));
		dd[i].fiction();
	}
	System.out.print("\nEnter no of literature books:");
	int n1=a.nextInt();
	literature ll[]=new literature[n];
	for(i=0;i<n1;i++)
	{
		System.out.println("Details of literature book "+(i+1));
		ll[i]=new literature();
		ll[i].publisher();
		ll[i].book();
	}
	for(i=0;i<n1;i++)
	{
		System.out.println("Details of literature book "+(i+1));
		ll[i].literature();
	}
	}
}