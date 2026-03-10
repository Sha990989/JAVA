/*prime number
t/f
1 to 50
by  finding factors we can reduce time complexity and easily find prime number are not */
public class primenumber {
    public static void main(String[] args) {
        int num = 45;
        int count = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {   
                count++;
            }
        }

        if (count == 1) {  // only factor 1 should be counted
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }
    }
}
