import java.util.Scanner;
public class Program5{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the size of the Array: ");
		int s = sc.nextInt();
		String str[] = new String[s];
		int i;
		System.out.println("Enter the Elements of the Array: ");
		for (i = 0; i < str.length; i++) {
			str[i] = sc.next();
		}
		String temp;
		int j;
		for (i = 0; i < str.length; i++) {
			for (j = i + 1; j < str.length; j++) {
				if (str[i].compareTo(str[j]) > 0) {
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
		System.out.println("\nThe Sorted Array element: ");
		for (i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}
}
