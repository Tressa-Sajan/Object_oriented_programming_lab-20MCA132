// 20.Define 2 classes; one for generating a multiplication table of 5 and other for displaying first N prime numbers. Implement using threads. (Thread class)
import java.util.*;
class ThreadA extends Thread{
    public void run( ) {
    int n = 5;
    for (int i = 1; i <= 10; ++i)
        System.out.println(n + " * " + i +
        " = " + n * i);
    }
}
class ThreadB extends Thread{
    public void run( ){
    Scanner sc = new Scanner(System.in);
    int i,n,p,count,flag;
    System.out.println("Enter the limit to print prime numbers");
    n=sc.nextInt();
    System.out.println("First "+n+" prime numbers are :-");
    p=2;
    i=1;
    while(i<=n){
        flag=1;
    for(count=2;count<=p-1;count++){
        if(p%count==0){
            flag=0;
            break;
        }
    }
    if(flag==1){
        System.out.print(p+" ") ;
        i++;
    }
    p++;
    }
}
}
public class mtable{
    public static void main(String args[]) {
        ThreadA a = new ThreadA();
        ThreadB b = new ThreadB();
        a.start();
        b.start();
        System.out.println("Multiplication Table of 5");
    }
}