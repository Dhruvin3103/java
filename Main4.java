import java.util.*;
public class Main4
{
    public static void main(String args[]) {
    odd o =new odd();
    // Thread t = new Thread(o);
    o.start();
    
    even e =new even();
    // Thread y = new Thread(o);
    e.start();
    }
}


//using implements Runnable
// class odd implements Runnable
// {
//     public void run (){
//         for(int i=0 ;i<=5;i++){
//             System.out.println(i);
//         }
//     }
// }

// class even implements Runnable
// {
//     public void run (){
//         for(int i=0 ;i<=5;i++){
//             System.out.print(i);
//         }
//     }
// }


//using extends
class odd extends Thread
{
    public void run (){
        for(int i=0 ;i<=10;i++){
            System.out.println(i);
            try 
            {
                Thread.sleep(1000);
            } catch(Exception e) 
            {
                System.out.println("Exceptional");
            }
        }
    }
}

class even extends Thread
{
    public void run (){
        for(int i=10 ;i<=20;i++){
            System.out.println(i);
            try 
            {
                Thread.sleep(1000);
            } catch(Exception e) 
            {
                System.out.println("Expextionals");
            }
        }
    }
}