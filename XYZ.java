interface inter1
{
public void print();
}

interface inter2
{
public void print1();
}

class X implements inter1, inter2
{
public void print(){System.out.println("1st interface ");}
public void print1(){System.out.println("2nd interface ");}
}

public class XYZ{
public static void main(String args[])
{
X x =new X();
x.print();
x.print1();
}
}