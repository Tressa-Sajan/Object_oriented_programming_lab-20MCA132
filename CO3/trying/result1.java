import java.util.*;
interface students
{
	public void stget();
	public void stput();
}
interface sports
{
	public void spget();
	public void spput();
}
class result1 implements students,sports{
	String name,s;
	int m1, m2, tot, p;
	public void stget()
	{
		Scanner tre=new Scanner(System.in);
		System.out.print("\nEnter the name: ");
		name=tre.next();
		System.out.print("\nEnter the mark1: ");
		m1=tre.nextInt();
		System.out.print("\nEnter the mark2: ");
		m2=tre.nextInt();
		tot=m1+m2;
	}
	public void stput()
	{
		System.out.print("\nNAME: "+name);
		System.out.print("\nMARK1: "+m1);
		System.out.print("\nMAEK2: "+m2);
		System.out.print("\nTotal: "+tot);
	}
	public void spget()
	{
		Scanner tre = new Scanner(System.in);
		System.out.print("Enter the sports: ");
		s=tre.next();
		System.out.print("Enter the position: ");
		p =tre.nextInt();
	}
	public void spput()
	{
		System.out.print("SPORTS: "+s);
		System.out.print("POSITION: "+p);
	}
	public static void main(String args[])
	{
		result1 tre = new result1();
		tre.stget();
		tre.stput();
		tre.spget();
		tre.spput();
	}
}
		
		
	
		