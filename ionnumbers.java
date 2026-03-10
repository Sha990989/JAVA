//6=1*2*3*6=>factors
//6=2*3
public class ionnumbers {
    public static void main(String[] args) {
        for(int j=1;j<=100;j++)
        {
        int num=j;
        int product=0;
        for(int i=1;i<=num/2;i++)// num/2 gives the factors
        {
            if(num%i==0){
                product=product*i;
            }
        }
        if(num==product){
            System.out.println(product);
        }
    }
    
}

}
