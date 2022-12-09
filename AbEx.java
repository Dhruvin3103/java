abstract class Shape
{
double s1;
double s2;
Shape(double l, double b)
{
s1 = l;
s2 = b;
}
abstract void area();

}


class Circle extends Shape
{

Circle(double r, double y)
{
super(r,y);
}

void area()
{
double a = 3.14*s1*s1;
System.out.println(a);
}

}


class Rec extends Shape
{
Rec(double l, double b)
{super(l,b);}
void area()
{
double a1 = s1*s2;
System.out.println(a1);
}

}

public class AbEx
{
public static void main(String args[])
{
Circle c = new Circle(10,0);
Rec r = new Rec(6,7);

c.area();
r.area();
}
}