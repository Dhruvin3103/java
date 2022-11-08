import java.util.Scanner;
public class Pattern1
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int s=0;
        for(int i =1;i<=n;i++)
        {
            s=s+i;
            for(int k=i;k<=n;k++)
            {
                System.out.print(" ");                
            }
            int z=s;
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)(z+64));
                z--;
            }
            System.out.println("");
        }
    }
}
