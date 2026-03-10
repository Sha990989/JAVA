//input=37 output=12 =>finding serial number with the prime number
public class findingserialnumwithprimenum {
    public static void main(String args[])
    {
        int value=37;
        int sum=0;
        while(value>0)
        {       
            int rem=value%10;
            value=value/10;
            int flag=0;
            for(int i=2;i<=rem/2;i++)
            {
                if(rem%i==0)
                    flag=1;
            }
            if(flag==0)
                sum=sum+rem;
        }
        System.out.println(sum);

    }
}
