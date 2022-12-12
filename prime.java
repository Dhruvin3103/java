import java.util.Scanner;

public class prime    
{
   public static void main (String[] args)
   {		
       int i =0;
       int num =0;
       Scanner sc = new Scanner(System.in);
       System.out.print("enter a number : ");
       int n = sc.nextInt();
       System.out.print("prime numbers :");
       for (i = 1; i <= n; i++)         
       { 		  	  
          int counter=0; 	  
          for(num =i; num>=1; num--)
	  {
             if(i%num==0)
	     {
 		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
	  {
        if(i%2!=0)
	     {System.out.print(i+" ");}
	  }	
      
       }

      
      System.out.print("\nOdd numbers :");
      for (i = 1; i <= n; i++){
        if(i%2!=0)
        {System.out.print(i+" ");}
      }
   }
}