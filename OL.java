import java.util.*;

class Overload
{
    void area(float s)
    {
        System.out.println("Area of square is : "+s*s);
    }

    void area(float l, float b)
    {
        System.out.println("Area of rec is : "+l*b);
    }
}

public class OL
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner (System.in);
        Overload o = new Overload();
        System.out.print("Enter the choice \n 1)square 2) Rec \n");
        int n = sc.nextInt();

        switch (n) {
            case 1:
            System.out.print("Enter the sides : ");
            float s = sc.nextFloat();
                o.area(s);
                break;
            
            case 2:
                System.out.print("Enter the sides : ");
                float u = sc.nextFloat();
                float v= sc.nextFloat();
                    o.area(u,v);
                    break;
        
            default:
                break;
        }
    }
}