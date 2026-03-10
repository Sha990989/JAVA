/*Find max element in the array 
Algorithm:-
Intialize max=arr[0]
loop through array elements
if element > max, update max {for finiding smallest number element < min}
Return max */
public class findingmaxelementinarr{
    public static int  findMax(int [] arr)
    {
        int max=arr[0];
        for(int num:arr){
            if(num>max){
                max=num;
            }
        }
        return max;
    
    }
    public static void main (String[] args){
        int[] arr={10,20,30,8};
        System.out.println("Max value :"+findMax(arr));
    }
}
