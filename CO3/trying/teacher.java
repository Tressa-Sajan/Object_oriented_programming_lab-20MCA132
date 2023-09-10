import java.util.*;
class employee
{
	int empid;
	String ename;
	int esal;
	String eadd;
	employee(int id, String name, int salary, String address)
	{
	empid=id;
	ename=name;
	esal=salary;
	eadd=address;
	}
}
class teacher extends employee
{
	String dep;
	String Sub_taught;
	teacher(int id, String name, int salary, String address, String department, String Subject_Taught)
	{
		super(id, name, salary, address);
		dep=department;
		Sub_taught=Subject_Taught;
	}
	public void put()
	{
		System.out.println("\nEmployee name: "+ename);
		System.out.println(" Employee id:"+empid);
		System.out.println(" Employee Salary: "+esal);
		System.out.println(" Employee address: "+eadd);
		System.out.println(" Department: "+dep);
		System.out.println(" Subject taught: "+Sub_taught);
	}
	public static void main(String args[])
	{
		Scanner a = new Scanner(System.in);
		int i;
		System.out.print("Enter the number of enteries: ");
		int n = a.nextInt();
		teacher tech[]=new teacher[n];
		for(i=0;i<n;i++)
		{
			System.out.print("Enter employee id:");
			int empid=a.nextInt();
			System.out.print("Enter employee name:");
			String ename=a.next();
			System.out.print("Enter employee salary:");
			int esal=a.nextInt();
			System.out.print("Enter employee address:");
			String eadd=a.next();
			System.out.print("Enter teacher department:");
			String dep=a.next();
			System.out.print("Enter subject taught:");
			String Sub_taught=a.next();
			tech[i]=new teacher(empid, ename, esal, eadd, dep, Sub_taught);
		}
		for(i=0;i<n;i++)
		{
			tech[i].put();
		}
	}
}
