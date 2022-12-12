class ABC
{
	String s ="HEllo A";
}

class BC extends ABC
{
	String s = "Hello B";
}

class C extends BC
{
	String s = "Hello C";
}


public class ABCD
{
public static void main(String args[])
{
C c = new C();
System.out.println(c.s);
System.out.println(c.s);
System.out.println(c.s);
}
}