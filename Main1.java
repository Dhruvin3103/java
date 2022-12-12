import java.util.*;
class num1
{
    int i;
    num1(int y)
    {
        i=y;
    }
    
    void show()
    {System.out.println(i+" Super");}
}

class num2 extends num1
{
    int i;
    num2(int x)
    {
        super(10);
        i=x;
    }
    
    void show()
    {
        System.out.println((i+10)+" Sub");}

}

public class Main1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        num1 n1 = new num1(10);
        num2 n2 = new num2(-10);
        n1.show();

        n2.show();
        // // room r = new room(3,10);
        // // System.out.print(r.volume());
        

        // //multi -D array implementaion
        // System.out.println("Enter the size :");
        // int n =sc.nextInt();
        // int [][]a = new int [n][n];
        
        // for(int i=0;i<n;i++)
        // {
        //     System.out.println("Enter row "+(i+1));
        //     for(int j=0;j<n;j++)
        //     {a[i][j]=sc.nextInt();}
        // }
        // print(a,n);
        // for(int i=0;i<n;i++)
        // {
            
        //     for(int j=0;j<n;j++)
        //     {System.out.print(a[i][j]+" ");}
        //     System.out.println(" ");
        // }
    }
    // //taking array as arrugement
    // static void print(int [][]a, int n)
    // {
    //      for(int i=0;i<n;i++)
    //     {
            
    //         for(int j=0;j<n;j++)
    //         {System.out.print(a[i][j]+" ");}
    //         System.out.println(" ");
    //     }
    // }
}

// class room
// {
//     double length1,height,breath;
//     room(double l,double h,double b)
//     {
//        length1 =l; height=h; breath=b;
//     }

//     room(double l, double b)
//     {
//         length1=l;breath=b;height=1;
//     }

//     double volume()
//     {return length1*height*breath;}
// }