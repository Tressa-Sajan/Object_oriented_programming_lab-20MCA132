//program t d set ojct using linked hashset class 
import java.util.*;
public class LFG{
	public static void main(String[] jai)
	{
		Scanner sc =new Scanner(System.in);
		Set<String> hash_set = new HashSet<String>();
		System.out.println("Enter the limit:");
	   int limit = sc.nextInt();
	   System.out.println("Enter the elements: ");
	   for(int i=0;i<limit;i++)
		{
			hash_set.add(sc.next());
		}
	   System.out.println("hash set : "+hash_set);
	}
}