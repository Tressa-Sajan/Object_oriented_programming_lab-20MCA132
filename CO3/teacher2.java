//Create a class ‘Employee’ with data members Empid, Name, Salary, Address and 
//constructors to initialize the data members. Create another class ‘Teacher’ that inherit the 
//properties of class employee and contain its own data members department, Subjects taught 
//and constructors to initialize these data members and also include display function to 
//display all the data members. Use array of objects to display details of N teachers. 

import java.util.*;
class employee{
	int empid;
	String ename;
	int esal;
	String eaddress;
		employee(int id,String name,int salary,String address){
			empid=id;
			ename=name;
			esal=salary;
			eaddress=address;
		}
}
class teacher2 extends employee{
	String dept;
	String subj_taught;
		teacher2(int id,String name,int salary,String address,String department,String subject_taught){
			super(id,name,salary,address);
			dept=department;
			subj_taught=subject_taught;
		}
			
		public void put(){
			System.out.print("\n Employee id:"+empid);
			System.out.print("\n Employee name:"+ename);
			System.out.print("\n Employee salary: "+esal);
			System.out.print("\n Employee address"+eaddress);
			System.out.print("\n Department:"+dept);
			System.out.print("\n Subject handled:"+subj_taught);
		}
		public static void main(String[] args){
			Scanner a=new Scanner(System.in);
			int i;
			System.out.print("Enter number of entries:");
			int n=a.nextInt();
			teacher2 tech[]=new teacher2[n];
			for(i=0;i<n;i++)
			{
			System.out.print("Enter employee id:");
			int empid=a.nextInt();
			System.out.print("Enter employee name:");
			String ename=a.next();
			System.out.print("Enter employee salary:");
			int esal=a.nextInt();
			System.out.print("Enter employee address:");
			String eaddress=a.next();
			System.out.print("Enter teacher department:");
			String dept=a.next();
			System.out.print("Enter subject taught:");
			String subj_taught=a.next();
				tech[i]=new teacher2(empid,ename,esal,eaddress,dept,subj_taught);
			}
			for(i=0;i<n;i++){
				tech[i].put();
			}
			
		}

}