class A 
{
    int x,y;
    A(int x,int y)
    {
        this.x=x;
        this.y=y;
    System.out.println("x="+x);
    System.out.println("y="+y);
    }
}
class B extends A 
{ 
    int a,b;
    B (int a,int b)
    {
        super(15,17);
        this.a=a;
        this.b=b;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
class superwithparameterizedconstructor
{
    public static void main(String args[])
    {
        B obj=new B(27,19);
    }
}