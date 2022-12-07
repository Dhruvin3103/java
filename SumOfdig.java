import java.util.*;

class SumOfdig
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a digit : ");
        int n = sc.nextInt();
        // int m=0;
        int sum = sum(n);
        System.out.print("Sum of digit "+n+" is "+sum);
    }

    public static int sum(int n)
    {
        if(n==0)
        {return n;}
            
        return(n % 10 + sum( n/10));
    }
}