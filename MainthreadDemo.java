class MainthreadDemo
{
public static void main(String args[])
{
Even e = new Even();

e.start();
Odd o = new Odd();
o.start();
}
}


class Odd extends Thread
{
public void run()
{
for(int i=0;i<20;i++)
{
if(i%2!=0){System.out.println("Odd "+i);}
try
{
Thread.sleep(100);
}catch(Exception e){System.out.println(e);}
}}}

class Even extends Thread
{
public void run()
{
for(int i=0;i<20;i++)
{
if(i%2==0){System.out.println("Even "+i);}
try
{
Thread.sleep(200);
}catch(Exception e){System.out.println(e);}
}}}