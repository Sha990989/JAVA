class A
{
void set()
{
System.out.println("in class A");
}
}
class B extends A
{
void set1()
{
System.out.println("in class b");
}
}
class C extends A
{
void set2()
{
System.out.println("in class c");
}
}
class D extends A
{
void set3()
{
System.out.println("in class d");
}
}
class heirarchial
{
public static void main(String args[])
{
B b=new B();
C c=new C();
D d=new D();
b.set1();
b.set();
c.set2();
c.set();
d.set3();
d.set();
}
}