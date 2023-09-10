//16
package Graphics;
import java.util.*;
public class shapes implements Area1
{
	double lr,lb,ra,th,tb,ta,saa,sa,cr,cc;
	public void getrect()
	{
		Scanner ab= new Scanner(System.in);
		System.out.println("Enter the length of the rectangle");
		lr=ab.nextInt();
		System.out.println("Enter the breadth of the rectangle");
		lb=ab.nextInt();		
	}
	public void rectangle()
	{
		ra=lr*lb;
		System.out.println("Area of Rectangle is: "+ra);
	}
	public void getTri()
	{
		Scanner cb = new Scanner(System.in);
		System.out.println("Enter the height of the Triangle");
		th=cb.nextInt();
		System.out.println("Enter the base of the Triangle:");
		tb=cb.nextInt();   
	}
	public void Triangle()
	{
		ta=0.5*th*tb;
		System.out.println("Area of Triangle angle is:"+ta);
	}
	public void getSqr()
	{
		Scanner sq = new Scanner(System.in);
		System.out.println("Enter the side of the Square:");
		sa = sq.nextInt();
	}
	public void Square()
	{
		saa=sa*sa;
		System.out.println("Area of Square is: "+saa);
	}
	public void getCrl()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the Circle:");
		cc=sc.nextInt();
	}
	public void Circle()
	{
		cr=3.1*cc*cc;
		System.out.println("Area of circle: "+cr);
	}
	public static void main(String args[])
	{
		shapes o =new shapes();
		o.getrect();
		o.rectangle();
		o.getTri();
		o.Triangle();
		o.getSqr();
		o.Square();
		o.getCrl();
		o.Circle();
	}
}