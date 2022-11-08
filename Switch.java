import java.util.Scanner;

public class Switch 
{
  public static void main(String args []) 
  {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter two number : ");
     int a =sc.nextInt();
     int b =sc.nextInt();
     System.out.print("Menu\n1)ADD\n2)Subtract\n3)Multi\n4)Div\n");
     System.out.print("Enter a number : ");
     int n = 0;
     int c = sc.nextInt();
     switch(c)
     {
        case 1 :
         System.out.print(a+b);
         break;
        case 2:
         System.out.print(a-b);
         break;
        case 3 :
         System.out.print(a*b);
         break;
        case 4 :
         System.out.print((a/b));
         break;
        default:
         break;
     }
  }   
}