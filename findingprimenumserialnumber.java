//finding prime number serial number in the continous series
//input=37 output=12)37

import java.util.Scanner;

public class findingprimenumserialnumber {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;  // to count prime positions
        int current = 2; // start checking from prime 2

        while (true) {
            if (isPrime(current)) {
                count++;            // increase prime count
                if (current == num) {
                    System.out.println(count + ")" + num);
                    break;
                }
            }
            current++;
        }

        sc.close();
    }

    // Function to check prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}


