import java.util.*;


class Cons
{
    float a,d;
    Cons(float s)
    {
       a=s;
       d=s; 
    }

    Cons(float l, float b)
    {
        a=l;
        d=b;
    }

    void area()
    {
        System.out.println("Area : "+a*d);
    }

    
}

class ConsOL
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the choice \n 1)square 2) Rec \n");
        int n = sc.nextInt();

        switch (n) {
            case 1:
            System.out.print("Enter the sides : ");
            Cons sq = new Cons(sc.nextInt());
                sq.area();
                break;
            
            case 2:
                System.out.print("Enter the sides : ");
                Cons rec = new Cons(sc.nextInt(),sc.nextInt());
                rec.area();
                    break;
        
            default:
                break;
        }
    }
}