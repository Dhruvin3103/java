class MainthreadDemo
{
public static void main(String args[])
{
Thread t = Thread.currentThread();
System.out.println("Cuurent thread : "+t);
t.setName("T name");
System.out.println("Renamed : "+t);
}
}