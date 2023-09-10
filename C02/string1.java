//Perform string manipulations
import java.util.*;
public class string1{
	public static void main(String[] args)
	{
		Scanner tre=new Scanner(System.in);
		System.out.println(" Enter the frist string:");
		String s=tre.nextLine();
		System.out.println(" Enter the second string:");
		String s1=tre.nextLine();
		if (s==s1)
		{
			System.out.println("two string are equal");
		}
		else
		{
			System.out.println("two string are not equal");
		}
		
		System.out.println("concat of two string:"+s.concat(s1));
		System.out.println("length of the frist string:"+s.length());
		System.out.println("length of the second string:"+s1.length());
		System.out.println("upper case string1:"+s.toUpperCase());
		System.out.println("lower case string1:"+s.toLowerCase());
		System.out.println("upper case string2:"+s1.toUpperCase());
		System.out.println("lower case string2:"+s1.toLowerCase());	
	}
}