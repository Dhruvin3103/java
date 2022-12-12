import java.util.*;

public class table{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number of students : ");
      int n = sc.nextInt();
      System.out.print("Enter the number of subjects : ");
      int m = sc.nextInt();
      int [][]a = new int[(n+1)][(m+1)];
      for(int i=0; i<n;i++){
        for(int j=0; j<m;j++){
          System.out.print("Enter the marks of sub "+(j+1)+":");
          a[i][j]= sc.nextInt();
        }
      }
      // 
      int c=0;
      // System.out.print(a.length);
      for(int i=0; i<n;i++){
        for(int j=0; j<m;j++){
          c=c+a[i][j];
        }
        a[i][m]=c;
        c=0;
      }
      // 
      for(int j=0; j<m;j++){
        for(int i=0; i<n;i++){
          c=c+a[i][j];
        }
        a[n][j]=c;
        c=0;
      }
      
      for(int i=0; i<=n;i++){
       c=c+a[i][m];
      }
      a[n][m]=c;
      c=0;
      
      for(int i=0; i<=n;i++){
        for(int j=0; j<=m;j++){
          System.out.print(a[i][j]);
          System.out.print(" ");
          if(j==m-1){
            System.out.print("|");
          }
          
          // a[i][j]= sc.nextInt();
        }System.out.print('\n');
        if(i==n-1)
        {System.out.print("------------------------------");
        System.out.print('\n');}
      }
    }
}