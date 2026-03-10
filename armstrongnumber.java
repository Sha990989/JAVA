//153=1*1*1+5*5*5+3*3*3
 public class armstrongnumber {
    public static void main(String args[])
    {
        int num=153;
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
            sum=sum+exp;
            num=num/10;

        }
        if(sum==temp){
            System.out.println("Armstrong number");
        }else{
            System.out.println(" not Armstrong number");
        }
    }
}
