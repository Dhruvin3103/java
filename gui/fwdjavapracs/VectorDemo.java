import java.util.*;
class VectorDemo
{
public static void main(String z[])
{
Vector v=new Vector(5,3);
System.out.println("size "+v.size());
System.out.println("Capacity "+v.capacity());
v.addElement(new Integer(5));
v.addElement(6);
v.addElement(new Float(5.3));
v.addElement(new Integer(567));
v.addElement(new Integer(5));
v.addElement(new Integer(6));
System.out.println("size "+v.size());
System.out.println("Capacity "+v.capacity());
System.out.println(v);
System.out.println("FirstElement "+v.firstElement());
System.out.println("LastElement "+v.lastElement());
//v.removeElement(5);
System.out.println("Index of 5 is "+v.indexOf(5));
System.out.println("last Index of 5 is "+v.lastIndexOf(5));
v.removeElementAt(1);
System.out.println("Element at 3rd Index "+v.elementAt(3));
System.out.println(v);
}
}
