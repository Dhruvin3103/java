import java.util.Scanner;
public class Count
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int a,c=0;
        while(n!=0)
        {
            // a=n%10;
            c=c+1;//count variable
            n=n/10;
        }
        System.out.println(c);   
    }    
}
