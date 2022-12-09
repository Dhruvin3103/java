import java.util.*;


class Name
{
public void age()
{System.out.println(56);}
void age2()
{
Scanner sc = new Scanner (System.in);
System.out.println(sc.nextInt());
}

void age3(int v)
{
System.out.println(v);
}
}

class NameInherit extends Name
{
public static void main(String args[])
{
Scanner sc = new Scanner (System.in);
NameInherit n = new NameInherit();
n.age();
n.age2();
n.age3(sc.nextInt());
}
}