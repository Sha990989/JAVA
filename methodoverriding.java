class A{
    int i,j;
    void set(int x,int y)
    {
        i=x;
        j=y;
    }
    void display()
    {
        System.out.println("i="+i+", j="+j);
    }
}
class B extends A{
    int k;
    void set(int z)
    {
        k=z;
    }
    void display()
    {
        super.set(10,20);
        super.display();
        System.out.println("k="+k);
    }
}
class methodoverriding{
    public static void main(String args[])
    {
        A a=new A();
        B b=new B();
        b.set(30);
        b.display();

    }
}