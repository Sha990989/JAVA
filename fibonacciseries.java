//write a program to print fibonacci series upto 50
//output:-0 1 1 2 3 5 8
/*logic :
a=0
b=1
a=b
b=temp
temp=a+b */
public class fibonacciseries {
    public static void main(String[] args) {
    int a=0;
    int b=1;
    int temp=0;
    for(int i=1;i<=30;i++)
    {
        a=b;
        b=temp;
        temp=a+b;
        System.out.println(" "+temp);

    }
    
    }
}
