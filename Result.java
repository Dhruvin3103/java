import java.util.*;
import java.io.*;

class Marksoutofbound extends Exception
{
Marksoutofbound(String error)
{System.out.println(error);}
}


class Result
{
public static void main(String args[])
{
Scanner sc = new Scanner (System.in);
// String name;
int m1,m2,m3,seat,c=1;
while(c==1)
{
try{
System.out.println("Enter the following data : ");
System.out.print("seat no :");
seat = sc.nextInt();
System.out.print("name : ");
String name = sc.next();
System.out.print("mark of sem 1 : ");
m1 = sc.nextInt();
System.out.print("mark of sem 2 : ");
m2 = sc.nextInt();
System.out.print("mark of sem 1 : ");
m3 = sc.nextInt();

marks(seat,m1,m2,m3,name);
}
catch(Exception e)
{System.out.println(e);}
System.out.print("Enter a choice : ");
c = sc.nextInt();
}
System.out.println("1]Enter stud data \n 2]exit");
}

static void marks(int seat, int m1, int m2, int m3, String name) throws Marksoutofbound
{
if(m1>100 || m1<0)
{throw new Marksoutofbound("Invalid input");}
else if(m2>100 || m2<0)
{throw new Marksoutofbound("Invalid input");}
else if(m3>100 || m3<0)
{throw new Marksoutofbound("Invalid input");}
else
{
System.out.println("Result");
System.out.println(seat);
System.out.println(m1);
System.out.println(m2);
System.out.println(m3);
System.out.println(name);
}
}
}







