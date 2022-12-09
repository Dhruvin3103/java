import java.util.*;

class Exception_hand
{
public static void main(String args[])
{
Scanner sc = new Scanner (System.in);
int n = sc.nextInt();
try
{
System.out.println("User entered : "+n);
}
catch(Exception e)
{
System.out.println("Exception occured : "+e);
}
}
}