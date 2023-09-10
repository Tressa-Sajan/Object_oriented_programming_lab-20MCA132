import java.util.*;
class CPU{
	int price;
	CPU()
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the price: ");
		price=obj.nextInt();
	}
	public void display()
	{
		System.out.println("Price: "+price);
	}
	class Processor
	{
			int core;
			String manufature;
			Processor()
			{
				Scanner obj1=new Scanner(System.in);
				System.out.print("Enter the core: ");
				core=obj1.nextInt();
				System.out.print("Enter the Manufature: ");
				manufature=obj1.next();			
			}
			public void display1()
			{
				System.out.println("Core: "+core);
				System.out.println("Manufature: "+manufature);
			}
	}
	static class Ram
	{
		int memory;
		String manufature1;
		Ram()
		{
			Scanner obj2=new Scanner(System.in);
			System.out.print("Enter the Memory: ");
			memory=obj2.nextInt();
			System.out.print("Enter the Manufature: ");
			manufature1=obj2.next();			
		}
		public void display2()
		{
			System.out.println("Memory: "+memory);
			System.out.println("Manufature: "+manufature1);
		}	
	}
}
public class CpuDetails
{
	public static void main(String args[])
	{
		CPU c=new CPU();
		c.display();
		CPU.Processor s= c.new Processor();
		s.display1();
		CPU.Ram p=new CPU.Ram();
		p.display2();
	}
}	
