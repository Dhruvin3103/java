class Circle1
{
    double radius;
    Circle1(double r)
    {radius=r;}
    double area()
    {return (3.14*radius*radius);}
}

class Cyn extends Circle1
{
    double area;
    Cyn(double r, double h) 
    {
        super(r);
        area = h*(super.area());
    }
    double area()
    {return area;}
    
}

class A
{
    String a;
    void show(){}
}


public class Main2{
public static void main(String args[]) 
{
    Circle1 c = new Circle1(10.0);
    Cyn c1 = new Cyn(10,10);
    System.out.println(c.area());
    System.out.println(c1.area());
//  Complex c1 = new Complex(3,-5);
//  Complex c2 = new Complex(2,-4);
//  Complex c = new Complex();
//  c1.display(); 
//  c.add(c1,c2);
//  c.display();  o
}}


// class Complex
// {
//     int real,imag;
//     Complex()
//     {real=0;
//         imag=0;}
//     Complex(int r, int i)
//     {
//         this.real = r;
//         this.imag = i;
//     }

//     void add(Complex c1, Complex c2)
//     {
//         real = c1.real+c2.real;
//         imag = c1.imag+c2.imag;
//     }

//     void display()
//     {
//         if(imag>0)
//         {System.out.println(real+"+"+imag+"i");}
//         else
//         {System.out.println(real+""+imag+"i");}
//     }
// }