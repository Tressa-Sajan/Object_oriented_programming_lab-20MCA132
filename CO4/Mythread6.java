//6,21.Define 2 classes; one for generating Fibonacci numbers and other for 
//displaying even numbers in a given range. Implement using threads. 
//(Runnable Interface)
import java.util.*;
public class Mythread6{
	public static void main(String args[])
	{
		Runnable r1 = new Runnable1();
		Thread t1 = new Thread(r1);
		t1.start();
		Runnable r2 =  new Runnable2();
		Thread t2 = new Thread(r2);
		t2.start();
	}
}
class Runnable2 implements Runnable{
	public void run()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\n"+"Enter the limit to print even numbers: ");
		int n =sc.nextInt();
		System.out.println("Even numbers upto"+n);
		for(int i=1;i<n;i++)
		{
			if(i%2==0)
				System.out.println(i);
		}
	}
}
class Runnable1 implements Runnable{
	public void run()
	{
		int n1=0,n2=1,n3,i,count=10;
		System.out.print("Fibonacci series: ");
		System.out.print(n1+""+n2);
		for(i=2;i<count;i++)
		{
			n3=n1+n2;
			System.out.print(""+n3);
			n1=n2;
			n2=n3;
		}
	}
}

		
		
		
		
