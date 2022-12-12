public class PrimeNO
{
    public static void main(String args[])
    {
        int n=30;
        for(int i=1;i<30;i++)
        {
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                    break;
            }
            if(i==j){System.out.print(i+" ");}
        }
    }
}