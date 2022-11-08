import java.util.*;

public class irregular{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number of row : ");
      int n = sc.nextInt();
      int [][]a = new int[n][n];
      for(int i=0; i<n;i++){
        for(int j=0; j<i+1;j++){
          System.out.print("Enter the numbers :");
          a[i][j]= sc.nextInt();
        }
      }

      for(int i=0; i<n;i++){
        for(int j=0; j<i+1;j++){
          System.out.print(a[i][j]);
          
          // a[i][j]= sc.nextInt();
        }System.out.print('\n');
      }
    }
}