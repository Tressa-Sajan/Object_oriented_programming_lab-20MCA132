//Maintain a list of Strings using ArrayList from collection framework, perform built in operations.

import java.util.ArrayList;
import java.util.Collections;
public class arraylist {
public static void main(String[] args) {
ArrayList<String> sc = new ArrayList<String>();
sc.add("HP");
sc.add("Acer");
sc.add("Dell");
sc.add("Apple");
sc.add("Lenovo");
System.out.println("The items in ArrayList are:");
for(String laptop:sc){
System.out.println(""+laptop);
}
sc.remove("Apple");
 sc.remove(2);
 System.out.println("\nArrayList after remove operation:");
 for(String laptop:sc) {
 System.out.println(laptop);
 }
 Collections.sort(sc);
System.out.println("\nArrayList after sorting:");
 for (String laptop: sc) {
 System.out.println(laptop);
 }
 sc.add(2, "AGB");
 System.out.println("\nModified ArrayList:"+sc);
 System.out.println("\nObject at index 2:"+sc.get(1));
 System.out.println("\nSize of the ArrayList:"+sc.size());
 System.out.println("\nHP is in the ArrayList :"+sc.contains("HP"));
 System.out.println("\nAsus is in the ArrayList :"+sc.contains("Asus"));
 sc.clear();
 System.out.println("\nArrayList after clear method:"+sc);
}
}
