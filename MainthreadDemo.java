class MainthreadDemo
{
public static void main(String args[])
{
Prime e = new Prime();
Nat n = new Nat();
Odd o = new Odd();
System.out.println(e.getState());
n.start();
n.interrupt();
System.out.println(n.getState());
o.start();
e.start();

}
}

class Nat extends Thread
{
public  Synchronized run()
{
for(int i=0;i<20;i++)
{
{System.out.println("Nat "+i+getState());}
try
{
Thread.sleep(100);
System.out.println(getState());
}catch(Exception e){System.out.println(e);}
}}}

class Odd extends Thread
{
public void run()
{
for(int i=0;i<20;i++)
{
if(i%2!=0){System.out.println("Odd "+i+getState());}
try
{
Thread.sleep(200);
}catch(Exception e){System.out.println(e);}
}}}

class Prime extends Thread
{
int j;
public void run()
{
for(int i=1;i<20;i++)
{
for(j=2;j<i;j++)
{if(i%j==0)break;}
if(i==j){System.out.println("Prime "+i+getState());}
try
{
Thread.sleep(300);
}catch(Exception e){System.out.println(e);}
}}}