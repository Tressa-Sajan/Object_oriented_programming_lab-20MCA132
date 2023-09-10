//14,Create an interface having prototypes of functions area() and perimeter(). Create two 
//classes Circle and Rectangle which implement the above interface. Create a menu driven 
//program to find the area and perimeter of objects.import java.util.*;
//interface proto
import java.util.*;
interface proto
{
	public void get();
	public void area();
	public void per();
}
class circle implements proto
{
	double r,pe;
	double a;
	public void get()
	{
	Scanner a=new Scanner(System.in);
	System.out.print("\nEnter radius of circle: ");
	 r=a.nextInt();
	 }
	 public void area()
	 {
	 a=3.14*r*r;
	 System.out.println("**************************");
	 System.out.println("Area of circle: "+a);
	 System.out.println("**************************");
	 }
	  public void per()
	 {
	 pe=2*3.14*r;
	 System.out.println("**************************");
	 System.out.println("Perimeter of circle: "+pe);
	 System.out.println("**************************");
	 }
}
class rectangle implements proto
{
	int l,b,ar,p;
	public void get()
	{
	Scanner a=new Scanner(System.in);
	System.out.print("\nEnter length of rectngle: ");
	 l=a.nextInt();
	 System.out.print("Enter breadth of rectngle: ");
	 b=a.nextInt();
	 }
	 public void area()
	 {
	 ar=l*b;
	 System.out.println("**************************");
	 System.out.println("Area of rectngle: "+ar);
	 System.out.println("**************************");
	 }
	 public void per()
	 {
	 p=2*(l+b);
	 System.out.println("**************************");
	 System.out.println("Perimeter of rectngle: "+p);
	 System.out.println("***************************");
	 }
	
}
class abc{
public static void main(String[] args)
	{int ch;
	do{	
	Scanner a=new Scanner(System.in);
	circle c=new circle();
	rectangle r=new rectangle();
	System.out.println("Choose your choice: ");
	System.out.println("1.Area of circle \n2.Perimeter of circle \n3.Area of rectangle \n4.Perimeter of rectangle \n5.Exit");
	ch=a.nextInt();
	switch (ch)
	{
	case 1:
		c.get();
		c.area();
		break;
	case 2:	
		c.get();
		c.per();
		break;
	case 3:
		r.get();
		r.area();
		break;
	case 4:	
		r.get();
		r.per();
		break;
	case 5:
		break;
	default:
		System.out.println("***choose valid options***");
		break;
		
	}}
	while(ch!=5);
		
	}
	}
