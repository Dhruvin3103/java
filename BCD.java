import java.util.*;

class Swap
{
String s1;
String s2;
String temp;
Swap(String sa, String sb)
{
	s1=sa;
	s2=sb;
	temp = s1;
	s1 = s2;
	s2 = temp;
}

}

public class BCD
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
String s1,s2;
System.out.println("Enter two strings : ");
s1 = sc.nextLine();
s2 = sc.nextLine();
System.out.println("s1 and s2 "+s1+" "+s2);
Swap c = new Swap(s1,s2);
System.out.println("s1 and s2 "+c.s1+" "+c.s2);

}
}
