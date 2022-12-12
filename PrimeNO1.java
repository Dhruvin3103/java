public class PrimeNO1
{
    public static void main(String args[])
    {
        int n=300,i,j;
        for(i=1;i<n;i++)
        {
            for(j=2;j<i;j++)
            {
                if(i%j==0)
                    break;
            }
            if(i==j){System.out.print(i+" ");}
        }
    }
}