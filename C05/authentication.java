//Write a user defined exception class to authenticate the user name and password.

import java.util.Scanner;
public class authentication 
{
 public static void main(String[] args) 
{
 String username = "username";
 String password = "password";
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the Username");
 String u1 = sc.nextLine();
 System.out.println("Enter the Password");
 String u2 = sc.nextLine();
 try
 {
 if ((u1.equals(username)) && (u2.equals(password))) 
 System.out.println("Access Granted");
else if ((!u1.equals(username)) && (u2.equals(password))) 
 System.out.println("username not match");
else if ((u1.equals(username)) && (!u2.equals(password))) 
 System.out.println("Password not match");
 else
 throw new credentialexception("Invalid Username or Password");
 }
 catch (credentialexception e)
 {
 System.out.println(e.getMessage());
 }
 }
}
class credentialexception extends Exception{
 public credentialexception(String s)
{
 super(s);
 }
}
