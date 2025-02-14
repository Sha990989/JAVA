public class thiskeyword {
    public int a;
    public void set(int a)
    {
        this.a=a;
    }
    public void display()
    {
        System.out.println("a="+a);
    }
    public static void main(String args[])
    {
        thiskeyword s=new thiskeyword();
        s.set(5);
        s.display();
    }
    }

