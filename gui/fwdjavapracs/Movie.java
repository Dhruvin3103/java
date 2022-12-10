class Movie extends Thread
{
int v=1,r;
Movie(int x)
{
r=x;
}
public synchronized void run()
{
if(r<=v)
{
System.out.println("tickets are booked for "+Thread.currentThread().getName());
try
{
Thread.sleep(100);
}
catch(Exception e){}
v=v-r;
}
else
{
System.out.println("Housefull "+Thread.currentThread().getName());
}
}
}
class Main
{
public static void main(String z[])
{
Movie m=new Movie(1);
Thread t1=new Thread(m);
Thread t2=new Thread(m);
t1.setName("Ajay");
t2.setName("Vijay");
t1.start();
t2.start();
}
}
