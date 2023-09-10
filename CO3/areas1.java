
// 9.Area of different shapes using overloaded functions

import java.util.*;
public class areas1
{
	public void shape(int r)
	{
		double area_of_circle=22/7*r*r;
		System.out.print("Area of circle is:"+area_of_circle);
	}
		
	public void shape(int b,int h)
	{
		double area_of_triangle=0.5*b*h;
		System.out.println("Area of triangle is: "+area_of_triangle);	
	}	

	public void shape(double y)
	{	
	    double area_of_square=y*y;
		System.out.println("Area of square is: "+area_of_square);	
	}
		
	public void shape(double l,double w)
	{	
	    double area_of_rectangle=l*w;
		System.out.println("Area of rectangle is: "+area_of_rectangle);
	}	
	public void shape(double x,int f)
	{	
	    double area_of_parallelogram=x*f;
		System.out.println("Area of parallelogram is: "+area_of_parallelogram);
	}	
	public void shape(double p,int q,double s)
	{	
	    double area_of_trapezium=(0.5*(p+q))*s;
		System.out.println("Area of trapezium is: "+area_of_trapezium);

	}
	public void shape(int t,double u)
	{	
	    double area_of_ellipse=3.14*t*u;
		System.out.println("\nArea of ellipse is: "+area_of_ellipse);
	}			
		
	public static void main(String[] args)
	{
		Scanner a=new Scanner(System.in);
		areas z=new areas();
		System.out.println("\n AREA OF CIRCLE ");
		System.out.print("Enter radius of circle: ");
		int r=a.nextInt();
		z.shape(r);
		
		System.out.print("\n\n AREA OF TRIANGLE ");
		System.out.print("\nEnter base of triangle: ");
		int b=a.nextInt();
		System.out.print("Enter height of triangle: ");
		int h=a.nextInt();
		z.shape(b,h);
		
		System.out.print("\n\n AREA OF SQUARE ");		
		System.out.print("\nEnter side of square: ");
		double y=a.nextDouble();	
		z.shape(y);
		 
		System.out.print("\n\n AREA OF RECTANGLE ");
		System.out.print("\nEnter length of rectangle:");
		double l=a.nextDouble();
		System.out.print("Enter width of rectangle:");
		double w=a.nextDouble();
		z.shape(l,w);	

		System.out.print("\n\n AREA OF PARALLELOGRAM ");
		System.out.print("\nEnter base of parallelogram:");
		double x=a.nextDouble();
		System.out.print("Enter height of parallelogram:");
		int f=a.nextInt();
		z.shape(x,f);
		
		System.out.print("\n\n AREA OF TRAPEZIUM ");
		System.out.print("\nEnter length of parallel side 1 of trapezium:");
		double p=a.nextDouble();
		System.out.print("Enter length of parallel side 2 of trapezium:");
		int q=a.nextInt();
		System.out.print("Enter height of trapezium:");
		double s=a.nextDouble();
		z.shape(p,q,s);
		
		System.out.print("\n\n AREA OF ELLIPSE ");
		System.out.print("\nEnter minor axis of ellipse:");
		int t=a.nextInt();
		System.out.print("Enter major axis of ellipse:");
		double u=a.nextDouble();
		z.shape(t,u);
	}		
}
