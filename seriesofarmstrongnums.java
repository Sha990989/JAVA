public class seriesofarmstrongnums {
    public static void main(String args[])
    {
        for(int j=1;j<=1000;j++){
        int num=j;
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
            System.out.println(temp);
        }
    }
    }
}
