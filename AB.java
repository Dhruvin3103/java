import java.util.*;

abstract class Base{
    protected float l,b,area;
    abstract void calucate();
    public void display()
    {
        System.out.println("Area = "+area);
    }
}

class Square extends Base{
    public void read(float x){
        l=x;
    }

    public void calucate(){
        area=l*l;
    }
}

class Triangle extends Base
{
    public void read(float x,float y)
    {
        l=x;
        b=y;
    }
    public void calucate()
    {
        area=0.5f*l*b;
    }
}

class AB{
    public static void main(String args[]){
        float x,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Square");
        System.out.println("Enter the length of side : ");
        x =sc.nextFloat();
        Square s = new Square();
        s.read(x);
        s.calucate();
        s.display();
        System.out.println("Triangle");
        System.out.println("Enter the height and breadth : ");
        x = sc.nextFloat();
        y = sc.nextFloat();
        Triangle t = new Triangle();
        t.read(x,y);
        t.calucate();
        t.display();                
    }
}