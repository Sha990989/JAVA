/*input:-Enter comma seperated integers:
         10,20,3,4,2,15
  output:- Minimum Element:2 */
import java.util.Scanner;
public class MinInArrusingsplitndscanner {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter comma seperated integers:");
        String input=sc.nextLine();
        String[] strArr=input.split(",");//Split input string by comma
        //Convert String array to Integer array
        int[] arr=new int[strArr.length];
        for(int i=0;i<strArr.length;i++){
            arr[i]=Integer.parseInt(strArr[i].trim());
        }
        System.out.println("Minimum Element:"+findMin(arr));
        sc.close();
    }
     public static int  findMin(int [] arr)
    {
        int min=arr[0];
        for(int num:arr){
            if(num<min){
                min=num;
            }
        }
        return min;
    }
}
