class Sq
{
int s;

Sq(int n)
{
s = n*n;
System.out.println(s);
}

}

class Cube extends Sq
{
int s;

Cube(int m)
{
super(m);
s = m*m*m;
System.out.println(s);
}

}


public class IHEx
{

public static void main(String args[])
{
Cube c = new Cube(5);
}

}