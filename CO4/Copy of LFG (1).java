//program t d set ojct using linked hashset class 
import java.util.*;
public class LFG{
	public static void main(String[] jai)
	{
		Scanner sc =new Scanner(System.in);
		Set<String> hash_set1 = new LinkedHashSet<String>();
		Set<String> hash_set2 = new LinkedHashSet<String>();
		System.out.println("Enter the limit:");
	   int limit = sc.nextInt();
	   System.out.println("Enter the elements for set1: ");
	   for(int i=0;i<limit;i++)
		{
			hash_set1.add(sc.next());
		}
	   System.out.println("hash set1 : "+hash_set1);
	   
	   System.out.println("Enter the elements for set2: ");
	   for(int i=0;i<limit;i++)
		{
			hash_set2.add(sc.next());
		}
	   System.out.println("hash set2 : "+hash_set2);
	   
	   Set<String> union = new LinkedHashSet<String>(hash_set1);
	   union.addAll(hash_set2);
	   System.out.println("UNION : "+union);
	   
	   Set<String> inter = new LinkedHashSet<String>(hash_set1);
	    inter.retainAll(hash_set2);
	   System.out.println("INTERSECTION : "+inter);
	   
	    Set<String> diff = new LinkedHashSet<String>(hash_set1);
	    diff.removeAll(hash_set2);
	   System.out.println("DIFERENCE : "+diff);
	   
	   
	   
	   
	    
	   
	   
	   
	   
	   
	   
	}
}