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
        while(c<6)
        {
            System.out.println(v.size());
            System.out.println("choice : ");
            c = sc.nextInt();
            switch(c){
            case 1 : System.out.print("add : ");v.add(sc.nextInt());break;
            case 2 : System.out.print("remove : ");v.remove((sc.nextInt())-1);break;
            case 3 : System.out.print("displaying : ");System.out.print(v);break;
            case 4 : System.out.print("get : ");System.out.println("find"+v.get(sc.nextInt()));break;
            case 5 :
            {
                System.out.println("frequncy Of : ");
                int k=sc.nextInt(),j=0;
                for(int i =0;i<v.size();i++)
                {if(v.get(i)==k)j++;}
                System.out.println("Freq : "+j);
            }
        }
        }
    }
}