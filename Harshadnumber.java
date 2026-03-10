// if a sum of the  factors of a number and product of the factors of a number both gives a same number i.e.,1+2+3=6 and 1*2*3=6
public class Harshadnumber {
    public static void main(String[] args) 
    {
        int num=6;
        int sum=0;
        for(int i=1;i<=num/2;i++)//num/2 gives the factors
        {
            if(num%i==0){
                sum=sum+i;
            }
        }
        if(num==sum){
            System.out.println("Harshad number");
        }else{
            System.out.println("not a harshad number");
        }
    }
    
}
