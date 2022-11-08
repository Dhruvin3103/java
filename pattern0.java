import java.util.Scanner;
public class pattern0
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
    
        for(int i =1;i<=n;i++)
        {
            if(i%2==0)//even
            { 
                for(int j=i;j>=1;j--)
                    {
                        System.out.print(j);
                    }  
            }
            else
            {
                for(int k=1;k<=i;k++)
                    {
                        System.out.print(k);                
                    }
            }
            
            // int z=s;
            
            System.out.println("");
        }
    }
    
}
