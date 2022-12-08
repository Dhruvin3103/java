import java.util.*;

class GcdLcm
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter the two numbers : ");
int a = sc.nextInt();
int b = sc.nextInt();
System.out.println("GCD : "+gcd(a,b));
System.out.println("lcm : "+lcm(a,b));
}

public static int gcd(int a, int b)
{
if(b==0)
{return a;}
return gcd(b,a%b);
}

public static int lcm(int a, int b)
{
return (a/gcd(a,b))*b;
}
}