class one
{
    int i=10;
    void show()
    {
        System.out.println("super class method i="+i);
    }
}
class Demo extends one
{
    int i=20;
    void show()
    {
        System.out.println("sub class method i="+i);
        super.show();
        System.out.println("super i="+super.i);
    }
}
class superkeyword
{
    public static void main(String args[])
    {
        Demo d=new Demo();
        d.show();
    }
}