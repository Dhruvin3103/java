import java.util.*;
import java.io.*;
class Buffer
{
public static void main(String args[]) throws IOException
{
BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
String s = b.readLine();
String s1 = b.readLine();
int i = Integer.parseInt(s);
int j = Integer.parseInt(s1);
System.out.println(i+j);
}
}