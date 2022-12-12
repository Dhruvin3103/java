import java.util.*;
class task extends Thread
{
Calendar  c;
Date d;
public void run()
{
for(int i=0;i<=2;i++)
{
try{
c = Calendar.getInstance();
d=c.getTime();
Thread.sleep(1000*4);
System.out.println(d);
}catch(Exception e){System.out.println(e);}
}
}
}

class Clock
{
public static void main(String args[])
{
task t = new task();
t.start();
}
}