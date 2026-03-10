//135=1+3*3+5*5*5=1+9+125=135
public class neonnumber {
    public static void main(String args[])
    {
        int num=135;
        int temp=num;
        int count=0;
        while (num!=0) {
            int lastdigit=num%10;
            count++;
            num=num/10;
    
        }
        num=temp;
        int sum=0;
        while(num!=0)
        {
            int lastdigit=num%10;
            int exp=1;
            for(int i=1;i<=count;i++)
            {
                exp=exp*lastdigit;
            }
            count--;
            sum=sum+exp;
            num=num/10;

        }
        if(sum==temp){
            System.out.println("neon number");
        }else{
            System.out.println(" not neon number");
        }
    }
}


