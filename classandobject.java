class sample
{
    public int a,b;
    public void set(int x,int y)
    {
        a=x;
        b=y;
    }
    public int add()
    {
        return (a+b);
    }
}
class classandobject
{
    public static void main(String args[])
    {
        sample r=new sample();
        r.set(2,3);
        int c=r.add();
         System.out.println("c="+c);
    }
}
