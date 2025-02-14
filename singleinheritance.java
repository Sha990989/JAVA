class A 
{
int x=5;
void getx()
{
System.out.println("x="+x);
}
}
class B extends A
{
int y=12;
void gety()
{
System.out.println("y="+y);
}
}
class Single
{
public static void main(String args[])
{
B b=new B();
b.getx();
b.gety();
}
}