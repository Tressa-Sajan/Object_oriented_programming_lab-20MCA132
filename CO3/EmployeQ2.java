
/* 10.Create a class ‘Employee’ with data members Empid, Name, Salary, Address and 
constructors to initialize the data members. Create another class ‘Teacher’ that inherits the 
properties of class employees and contains its own data members department, Subjects taught 
and constructors to initialize these data members and also include a display function to display 
all the data members. Use array of objects to display details of N teachers */

import java.util.*;
class Employe
{
	int Empid;
	String Name;
	int Salary;
	String Address;	
	Employe(int a,String b,int c,String d){
		Empid = a;
		Name = b;
		Salary = c;
		Address = d;
	}	
}
class Teacher extends Employe{
	String Department;
	String Subject;
	Teacher(int h,String i,int j,String k,String l,String m){
		super(h,i,j,k);
		Department = l;
		Subject = m;
	}
public void Display()
{
	System.out.println("\nEnter the Employe id: "+ Empid);
	System.out.println("Enter the Employe name:"+ Name);
	System.out.println("Enter the Employe Salary:"+ Salary);
	System.out.println("Enter the Employe address:"+ Address);
	System.out.println("Enter the teacher department:"+ Department);
	System.out.println("Enter the teacher subject:"+ Subject);
}
}
public class EmployeQ2{
	public static void main(String[] args){
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the limit of arrays: ");
		int n = sc.nextInt();
		Teacher s[] = new Teacher[n];
		
		for(i=0;i<n;i++){
			System.out.print("\nEnter the employe id: ");
			int a = sc.nextInt();
			System.out.print("Enter the employe name: ");
			String b = sc.next();
			System.out.print("Enter the employe salary: ");
			int c = sc.nextInt();
			System.out.print("Enter the employe address: ");
			String d = sc.next();
			System.out.print("Enter the teacher department: ");
			String e = sc.next();
			System.out.print("Enter the teacher subject: ");
			String f = sc.next();
			s[i] = new Teacher(a,b,c,d,e,f);
			
		}
		System.out.println("\n\n printing deatails: ");
		for(i=0;i<n;i++)
		{
			s[i].Display();
		}
	}
}
