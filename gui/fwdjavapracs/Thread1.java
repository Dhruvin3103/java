class Even extends Thread
{
public void run()
{
for(int i=0;i<=20;i+=2)
{
System.out.println(i);
try{
Thread.sleep(1000);
}
catch(Exception e){
}


}
}
}
class Odd extends Thread
{
public void run()
{
for(int i=1;i<=20;i+=2)
{
System.out.println(i);
try{
Thread.sleep(1000);
}
catch(Exception e){
}


}
}
}
class Main
{
public static void main(String z[])
{
Even e=new Even();
Odd o=new Odd();
e.start();
o.start();
}
}