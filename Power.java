import java.util.*;

class Power
{
	public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the numbers : ");
int n = sc.nextInt();
int m = sc.nextInt();
if(m<0)
{
double r = 1.0/(power(n,-m));
System.out.println(r);
}
else
{
int p = power(n,m);
System.out.println(p);	
}
}
public static int power(int n, int m)
{
if(m==0)
{return 1;}

return n*(power(n,m-1));
}
}