//Program to create a generic stack and do the Push and Pop operations.

import java.util.Scanner;
class StackArr
{
int a[] = new int[20];
int top=-1,ch,item,i;
Scanner sc = new Scanner(System.in);
public void stackoperation()
{
System.out.print("Enter the size of the array : ");
int n=sc.nextInt();
do
{
System.out.print("\t **CHOICES** ");
System.out.println("\n 1.PUSH \n 2.POP \n 3.DISPLAY \n 4.EXIT ");
System.out.print(" Enter your choice : ");
ch=sc.nextInt();
switch(ch)
{
case 1: if(top >=n-1)
 {
System.out.println("stack overflow");
 }
 else
 {
 System.out.print("enter the element :");
 item =sc.nextInt();
 top=top+1;
 a[top]=item;
 }
System.out.println(" item pushed");
 break;
case 2 : if(top<0)
 {
System.out.println("stack underflow");
 }
 else
 {
 a[top]='\0';
 top=top-1;
 }
System.out.println(" item popped");
 break;
case 3 :
 if(top < 0)
{
System.out.println("\n stack is empty");
}
else
{
System.out.println(" STACK ");
for(i=top;i>=0;i--)
{
System.out.println(a[i]);
}
}
 break;
case 4 : System.out.print("Terminate the stack");
 break;
default : System.out.println("\n Invalid choice");
}
}
while(ch!=4);
}
}
class generic
{
public static void main(String[] args)
{
StackArr sa =new StackArr();
sa.stackoperation();
}
}
