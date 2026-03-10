//static way 
//write a program for sum of even numbers and odd numbers in an array
class sumofevenndoddarray{
    public static void main(String[] args) {
        int[] arr={3,4,5,6,8,9,4,3,2};
        int sumEven=0;
        int sumOdd=0;
        for(int i=0;i<arr.length;i++){
           // System.out.println(arr[i]); prints all the elements in the array
           if(arr[i]%2==0){

            sumEven=sumEven+arr[i];
           }else{
            sumOdd=sumOdd+arr[i];
           }
    }
        System.out.println("Sum of Even Numbers: " + sumEven);
        System.out.println("Sum of Odd Numbers: " + sumOdd);

    }
}


/*   this code prints even numbers and odd numbers and their sum also


class SumOfEvenAndOddArray {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 8, 9, 4, 3, 2};

        int sumEven = 0;
        int sumOdd = 0;

        System.out.print("Even Numbers: ");
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");  // print even number
                sumEven += arr[i];
            }
        }

        System.out.print("\nOdd Numbers: ");
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");  // print odd number
                sumOdd += arr[i];
            }
        }

        System.out.println("\n\nSum of Even Numbers: " + sumEven);
        System.out.println("Sum of Odd Numbers: " + sumOdd);
    }
}
    */
