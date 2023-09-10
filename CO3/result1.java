//5,13.Create classes Student and Sports. Create another class Result inherited from Student and 
//Sports. Display the academic and sports score of a student. 
import java.util.*;
interface student
{	
  public void stget();
  public void stput();
}
interface sports
{
	public void spget();
	public void spput();
}
class result1 implements student,sports{
	String name,s;
	int m1,m2,tot,p;
	public void stget()
	{
	Scanner a=new Scanner(System.in);
	System.out.print("\nEnter the name: ");
	 name=a.next();
	System.out.print("Enter mark 1: ");
	m1=a.nextInt();
	System.out.print("Enter mark 2: ");
	 m2=a.nextInt();	
	 tot=m1+m2;
	}
	public void stput()
	{
	System.out.println("\n**************************");
	System.out.println("Name: "+name);
	System.out.println("Mark 1: "+m1);
	System.out.println("Mark 2: "+m2);
	System.out.println("Total: "+tot);
	System.out.println("**************************");
	}
	public void spget()
	{
	Scanner a=new Scanner(System.in);
	System.out.print("\nEnter the sports item participated: ");
	s=a.next();
	System.out.print("Enter the position: ");
	p=a.nextInt();
	}
	public void spput()
	{
	System.out.println("\n**************************");
	System.out.println("Sports item participated: "+s);
	System.out.println("Position attained: "+p);
	System.out.println("**************************\n");
	}
	public static void main(String args[])
	{
		result1 obj=new result1();
		obj.stget();
		obj.stput();
		obj.spget();
		obj.spput();
	}
}