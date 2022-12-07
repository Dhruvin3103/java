import java.util.*;
class Rev
{
    public static String rev(String s)
    {   
        if(s.isEmpty())
        {return s;}
        return rev(s.substring(1))+s.charAt(0);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        String s = sc.nextLine();
        String s1 =rev(s);
        System.out.print(s1);

    }
}