/*write a program for sum & rev of the digits,product,and count of the given  numbers */
import java.util.Scanner; //=>this is inbuilt function
public class sumproductandcount {
public static void main (String args[]){
Scanner sc=new Scanner(System.in); 
int num=sc.nextInt();
int sum=0;
int product=1;
int count=0;
int rev=0;
while(num!=0)
{
    int lastdigit=num%10;
    sum=sum+lastdigit;
    product=product*lastdigit;
    count++;
    rev=rev*10+lastdigit;
    num=num/10;
}
System.out.println("sum of the numbers:"+sum);
System.out.println("product of the numbers:"+product);
System.out.println("count of the numbers:"+count);
System.out.println("reverse of the numbers:"+rev);

sc.close();
} 
}
