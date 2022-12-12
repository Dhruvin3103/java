import java.util.*;
import.java.io.*;

class Marksoutofbound extends Exception
{
Marksoutofbound(String error)
{System.out.println(error);}
}
class Result{
public static void main(String args[])
{
Scanner sc = new Scanner (System.in);
String name,date;
int m1,m2,m3,seat,c=1;
while(c==1)
{
System.out.println("Enter the following data : ");
System.ouy.print("seat no :");
try{
seat.nextInt();
System.out.print("name : ");
name.nextLine();
System.out.print("mark of sem 1 : ");
m1.nextInt();
System.out.print("mark of sem 2 : ");
m2.nextInt();
System.out.print("mark of sem 1 : ");
m3.nextInt();
}catch(Exception e)
{System.out.println(e);}
}

System.out.println("1]Enter stud data \n 2]exit");
}}