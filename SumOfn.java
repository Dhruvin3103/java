import java.util.*;

class SumOfn
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        int m,c=0;
        m = (n*(n+1))/2;
        System.out.println("Sum of "+n+" Natural no. is "+m);
        int sum = sum(n,c);
        System.out.println("Sum of "+n+" Natural no. through rec. is "+sum);
    }

    public static int sum(int n,int m)
    {
        if(n==0)
        {return m;}
    
        return sum(n-1,m+n);
    }
}