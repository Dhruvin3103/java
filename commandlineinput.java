public class commandlineinput 
{
    public static void main(String args[])
    {
        int a=Integer.parseInt(args[0]),b=Integer.parseInt(args[1]),c=Integer.parseInt(args[2]);       
        int x = a<b?b:a;
        int y = x<c?c:x;
        System.out.print(y);
    }    
}
