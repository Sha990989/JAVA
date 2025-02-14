import java.util.*;
public class stringmethods
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String s1=sc.next();
        String s2=s.concat(s1);
        System.out.println(s2);
        int n=s.length();
        System.out.println("length:"+n);
        int n1=s2.length();
        System.out.println("length of s2:"+n1);
        boolean b=s1.equals(s2);
        System.out.println(b);
        s1.equalsIgnoreCase("Hello");

    }
}
    
