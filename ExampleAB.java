import java.util.*;

Abstract class ExampleAB
{
public int age=19;
public int year=2003;
public String name="Dhruvin";
public abstract void Bio();
}

class Student extends ExampleAB
{
public int mrk=75;
public void Bio()
{System.out.println("This contain bio");}
}

public static void main(String args[])
{
Student s = new Student();
Scanner sc = new Scanner(System.in);
System.out.println(s.age);
System.out.println(s.mrks);
System.out.println(s.age);
System.out.println(s.age);
System.out.println(s.age);
}