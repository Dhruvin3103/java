import java.util.*;
class Meta{

public static void checkMeta(String s1, String s2)
{
    char []c1 = s1.toCharArray();
    char []c2 = s2.toCharArray();
    if(s1.length()!=s2.length())
    {System.out.print("Two words are not meta");}
    else
    {
        for(int i=0;i<s1.length();i++)
        {
            for(int j=0;j<s1.length();j++)
            {
                // System.out.println(c1[i]+" "+c1[j]);
                // int count=0;
                swap(c1, i, j);
                System.out.println(" ");
                // System.out.println("Swap "+c1[i]+" "+c1[j]);
                for(int k=0;k<s1.length();k++)
                {
                    
                    // if(c1[k]==c2[k])
                    // {count++;}
                    System.out.print(c1[k]);
                }
                // System.out.println(count);
            }
        }
    }
}
public static void swap(char[] c, int i, int j) 
{
    char temp;
    temp = c[i];
    c[i] = c[j];
    c[j] = temp;
 }
public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two words : ");
    String s1 = sc.nextLine();
    String s2 = sc.nextLine();
    checkMeta(s1, s2);

}
}