interface Sports
{
int score = 50;
void m_score();
}


class Student
{
int roll;

void input(int n)
{roll = n;}
void print()
{System.out.println("Roll no : "+roll);}

}

class Test extends Student
{ 
int s1,s2;

void input(int n, int m)
{s1=n;
s2=m;}
void print()
{System.out.println("total mrk : "+(s1+s2));}
}

class Result extends Test implements Sports
{
//int r;
public void m_score()
{System.out.println("Total : "+(s1+s2+score));}

}


class IhIt
{
public static void main(String args[])
{
Result q = new Result();

q.input(100);
q.print();
q.input(23,25);
q.print();
q.m_score();

}
}