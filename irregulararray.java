import java.util.*;
public class irregularray{
    public static void main(String args[]){
     int arr[][]=new int[3][];
     arr[0]=new int[1];
     arr[1]=new int[2];
     arr[2]=new int[3];
     int count =1;
     int i,j;
     for(i=1;i<arr.length;i++)
     {
         for(j=1;j<arr[i].length;j++)
         {
             arr[i][j]=count++;
         }
          for(i=1;i<arr.length;i++)
     {
         for(j=1;j<arr[i].length;j++)
         {
             System.out.print(arr[i][j]);
           
     }
     System.out.println();
     }
     }
    }}