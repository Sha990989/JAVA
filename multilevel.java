class add
{
int x=5,y=6;
int z=x+y;
void display()
{
System.out.println("z="+z);
}
}
class sub extends add
{
int x=2,y=4;
int a=x-y;
void display1()
{
System.out.println("a="+a);
}
}
class mul extends sub
{
int x=2,y=6;
int b=x*y;
void display2()
{
System.out.println("b="+b);
}
public static void main(String args[])
{
mul m=new mul();
m.display();
m.display1();
m.display2();
}
}
