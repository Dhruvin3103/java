import java.util.*;
import java.io.*;
public class Countsen{
    public static void num(String s)
    {
        int num=0, alhpa=0, space=0;
        for(int i =0; i<s.length();i++)
        {
            char c = s.charAt(i);
            if(Character.isDigit(c))
            {num++;}
            else if(Character.isLetter(c))
            {alhpa++;}
            else if(Character.isSpaceChar(c))
            {space++;}
        }
        System.out.println("num : "+ num);
        System.out.println("alpha : "+ alhpa);
        System.out.println("space : "+ space);

    }
    public static void word(String s)
    {
        int word=0;
        char []c = s.toCharArray();
        for (int i=0;i<s.length();i++)
        {
            
        }
    }
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence : ");
        String s = sc.nextLine();
        int vowel = 0, cons=0;
        // String []a = new String[s.length()];
        for(int i=0;i<s.length();i++){
            // System.out.print(s.charAt(i)+" ");
            char c = s.charAt(i);
            if(c=='a' || c=='o'|| c=='i'|| c=='e'|| c=='u')
            {vowel++;}
            else if(c>'a' && c<='z')
            {cons++;}
            
        }
        System.out.println("vowels : "+ vowel);
        System.out.println("cons : "+ cons);
        num(s);
        }
        
    }
