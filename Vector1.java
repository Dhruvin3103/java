import java.util.*;
import java.io.*;

class Vector1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter no. elemt : ");
    //    int n = sc.nextInt();
       int c=0;
        Vector <Integer>v = new Vector<Integer>();
        // for(int i =0;i<n;i++)
        // {
        //     System.out.println("Enter "+(i+1));
        //     int k=sc.nextInt(); 
        //     v.add(k);
        // }
        // // v.remove(4);
        System.out.println(v);
        while(c<5)
        {
            System.out.println(v.size());
            c = sc.nextInt();
            switch(c){
            case 1 : v.add(sc.nextInt());break;
            case 2 : v.remove((sc.nextInt())-1);break;
            case 3 : System.out.print(v);break;
            case 4 : System.out.println("find"+v.get(sc.nextInt()));break;
            }
        }
    }
}