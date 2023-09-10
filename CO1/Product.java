import java.util.Scanner;

public class Product {
    int productId;
	String pname;
	int price;

    

    public void ask() {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter product code: ");
        productId = cin.nextInt();
		System.out.println("Enter product name: ");
        pname = cin.next();
		System.out.println("Enter product price: ");
        price = cin.nextInt();
    }

    public void display() {
        System.out.println("Product code is: " + productId);
		 System.out.println("Product name is: " + pname);
		 System.out.println("Product price is: " + price);
    }
	
	public static void main(String[] args) {
        Product ob1 = new Product();
		Product ob2 = new Product();
		Product ob3 = new Product();
        ob1.ask();
		ob1.display();
		ob2.ask();
		ob2.display();
		ob3.ask();
		ob3.display();
		
		if(ob1.price<ob2.price && ob1.price<ob3.price)
		{
			System.out.println("first product has lowest price");
		}
		else if(ob2.price<ob1.price && ob2.price<ob3.price)
		{
			System.out.println("second product has lowest price");
		}
		else
		{
			System.out.println("Third product has lowest price");
		}
    }
}
