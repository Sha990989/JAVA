// Java implementation to
// check if a number is ugly number
import java.io.*;
public class UglyNumber {

	// Function to check the ugly
	// number
	static int isUgly(int n)
	{
		// Base Cases
		if (n == 1)
			return 1;
		if (n <= 0)
			return 0;

		// Condition to check if
		// a number is divide by
		// 2, 3, or 5
		if (n % 2 == 0) {
			return (isUgly(n / 2));
		}
		if (n % 3 == 0) {
			return (isUgly(n / 3));
		}
		if (n % 5 == 0) {
			return (isUgly(n / 5));
		}
		return 0;
	}

	// Driver Code
	public static void main(String args[])
	{
		int no = isUgly(14);
		if (no == 1)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
