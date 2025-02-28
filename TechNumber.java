import java.util.Scanner;
public class TechNumber {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a four-digit number:");
int number = scanner.nextInt();
if (number < 1000 || number > 9999) {

System.out.println("Please enter a four-number");
} else {
int firstHalf = number / 100;
int secondHalf = number % 100;
int sum = firstHalf + secondHalf;
if (sum * sum == number) {
System.out.println(number + " is a Tech number");
} else {
System.out.println(number + " is not a tech number");
}
}
scanner.close();
}
}