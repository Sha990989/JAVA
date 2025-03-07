class C{
    int i;
    C(int x)
    {
        i=x;
    }
    void display()
    {
        System.out.println("i="+i);
    }
}
class D extends C{
    int j;
    D(int y)
    {
        super(10);
        j=y;
    }
    void display()
    {
        super.display();
        System.out.println("j="+j);
    }
}
class methodoverriding2{
    public static void main(String args[])
    {
        
        D obj2=new D(20);
        obj2.display();
    }
}









