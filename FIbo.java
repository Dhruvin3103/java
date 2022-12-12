class FIbo
{
public static void main(String args[])
{
int i1=0,j1=1;
System.out.print("0 1 ");

fibos(i1,j1,5);

}

static void fibos(int i,int j,int n)
{
int f = i+j;
System.out.print(f+" ");
if(n!=0)
{
fibos(j,f,n-1);
}
}
}