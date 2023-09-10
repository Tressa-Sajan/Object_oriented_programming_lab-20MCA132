// 11, 25. Program to remove all the elements from a linked list
import java.util.*;
public class Linkedlist{
	public static void main(String[] jai)
	{
	Scanner sc = new Scanner(System.in);
	LinkedList<String> list=new LinkedList<String>();
	System.out.print("\nEnter the limit: ");
	int limit = sc.nextInt();
	System.out.println("Enter the elements: ");
	for(int i=0;i<limit;i++)
		{
			list.add(sc.next());
		}
	System.out.println("list : "+list);
	list.clear();
	System.out.println("After removing all the elements: "+list);
	
	}
}
	
	