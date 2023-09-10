//Define 2 classes; one for generating Fibonacci numbers and other for displaying even 
//numbers in a given range. Implement using threads. (Runnable Interface).

import java.util.Scanner;
class Fib implements Runnable{
public void run(){
int a=0,b=1,c=0,n=20;
System.out.println("Fibonacci Series upto "+n+":\n");
while (n>0)
 {
 System.out.print(c+" ");
 a=b;
 b=c;
 c=a+b;
 n=n-1;
 }
System.out.println("\n\n*************************\n");
}
}
class EvenNo implements Runnable{
public void run(){
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Value of N:");
n=sc.nextInt();
System.out.println("Even Numbers from 1 to "+n+":");
for(int i=1;i<=n;i++) {
if(i%2==0) {
System.out.println(i);
}
}
}
}
public class fibo{
public static void main(String[] args) {
Fib obj=new Fib();
Thread t=new Thread(obj);
t.start();
EvenNo obj1=new EvenNo();
Thread t1=new Thread(obj1);
t1.start();
}
}
