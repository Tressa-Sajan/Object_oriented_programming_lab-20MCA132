//3. Add complex numbers
import java.util.*;
public class complex3{
	public static void main(String args[]){
			Scanner a=new Scanner(System.in);
			System.out.print("\nEnter first real part: ");
			int r1=a.nextInt();
			System.out.print("Enter first complex part: ");
			int c1=a.nextInt();
			System.out.print("\nfirst complex no: "+r1+" + "+c1+"i\n");
			System.out.print("\nEnter second real part: ");
			int r2=a.nextInt();
			System.out.print("Enter second complex part: ");
			int c2=a.nextInt();
			System.out.println("\nsecond complex no: "+r2+" + "+c2+"i\n");
			System.out.println("Sum is: "+(r1+r2)+" + "+(c1+c2)+"i");
			
	}
}