import java.util.*;
class CPU{
	int price;
	Scanner sc=new Scanner(System.in);
	public CPU()
	{
	 System.out.println("Enter price: ");
	 int price=sc.nextInt(); 
	}
	class processor
	{
	int no_of_cores;
	String manufacturer;
	public void ask(){
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Enter no.of cores: ");
	 no_of_cores=sc.nextInt();
	 System.out.println("Enter manufacturer name: ");
	 manufacturer=sc.next();
	}
	
	public void display(){
		System.out.println("No.of cores: "+no_of_cores);
		System.out.println("Processor Manufacturer: "+manufacturer);
	}
	}
	class Ram{
	int memory;
	String manufacturer1;
	public void ask1()
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter memory: ");
	 memory=sc.nextInt();
	 System.out.println("Enter manufacturer: ");
	 manufacturer1=sc.next();
	 }
	public void display1(){
		 System.out.println("Memory is: "+memory);
	 System.out.println("Manufacturer of RAM is: "+manufacturer1);
	 }
public static void main(String[] args){
	CPU cpu=new CPU(); 
	CPU.processor obj=cpu.new processor();
	obj.ask();
	CPU.Ram obj1=cpu.new Ram();
	obj1.ask1();
	System.out.println("Price: "+cpu.price);
	obj.display();
	obj1.display1();
}		
}		
}	


