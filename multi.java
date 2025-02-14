class add
{
int x;
int y;
void set(int a,int b)
{
x=a;
y=b;
}
void display()
{
int z=x+y;
System.out.println("z="+z);
}
}
class sub extends add
{
int a=x-y;
void display1()
{
System.out.println("a="+a);
}
}
class mul extends sub
{
int b=x*y;
void display2()
{
System.out.println("b="+b);
}
public static void main(String args[])
{
set(6,2);
display();
display1();
display2();
}
}
