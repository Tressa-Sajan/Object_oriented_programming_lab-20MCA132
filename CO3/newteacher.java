//3,11.Create a class ‘Person’ with data members Name, Gender, Address, Age and a constructor 
//to initialize the data members and another class ‘Employee’ that inherits the properties of 
//class Person and also contains its own data members like Empid, Company_name, 
//Qualification, Salary and its own constructor. Create another class ‘Teacher’ that inherits 
//the properties of class Employee and contains its own data members like Subject, 
//Department, Teacherid and also contain constructors and methods to display the data 
//members. Use array of objects to display details of N teachers. 
import java.util.*;
class person{
	String name;
	String gender;
	String address;
	int age;
	person()
	{
		Scanner a=new Scanner(System.in);
		System.out.print("\nEnter the name:");
		name=a.next();
		System.out.print("Enter the gender:");
		gender=a.next();
		System.out.print("Enter address:");
		address=a.next();
		System.out.print("Enter your age:");
		age=a.nextInt();
	
	}
}
class employee extends person{
	int empid;
	String company_name;
	String qualification;
	int salary;
	employee()
	{
		Scanner a=new Scanner(System.in);
		System.out.print("Enter employee id:");
		empid=a.nextInt();
		System.out.print("Enter company name:");
		company_name=a.next();
		System.out.print("Enter qualification:");
		qualification=a.next();
		System.out.print("Enter salary:");
		salary=a.nextInt();
	}
}
class newteacher extends employee{
	String sub;
	String dept;
	int teacherid;
	newteacher(){
		Scanner a=new Scanner(System.in);
		System.out.print("Enter subject taught:");
		sub=a.next();
		System.out.print("Enter department:");
		dept=a.next();
		System.out.print("Enter teacherid:");
		teacherid=a.nextInt();
	}
	public void put()
	{
		System.out.print("\n Employee name:"+name);
		System.out.print("\n Employee gender:"+gender);
		System.out.print("\n Employee address:"+address);
		System.out.print("\n Employee age:"+age);
		System.out.print("\n Employee id:"+empid);
		System.out.print("\n Employee company name:"+company_name);
		System.out.print("\n Employee qualification:"+qualification);
		System.out.print("\n Employee salary:"+salary);
		System.out.print("\n Subject handled by the teacher:"+sub);
		System.out.print("\n Teacher department:"+dept);
		System.out.print("\n Teacher id:"+teacherid);
	}

	public static void main(String[] args){
		Scanner a=new Scanner(System.in);
		int i;
		System.out.print("\nEnter number of entries:");
		int n=a.nextInt();
		newteacher tech[]=new newteacher[n];
		for(i=0;i<n;i++)
			{
			tech[i]=new newteacher();
			}
		for(i=0;i<n;i++)
			{
			tech[i].put();
			}
	}

}