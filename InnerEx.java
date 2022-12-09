class Math1
{
int x;
public Math1(int y)
{x= y;}
class Add1
{
int r;
Add1(int x, int y)
{r = x+y;}
}
class Sub1
{
int r;
Sub1(int x, int y)
{r = x-y;}
}
}

public class InnerEx
{
public static void main(String args[])
{
Math1 m = new Math1(5);
Math1.Add1 n = m.new Add1(5,5);
Math1.Sub1 l = m.new Sub1(5,10);
System.out.println(m.x);
System.out.println(n.r);
System.out.println(l.r);
}
}