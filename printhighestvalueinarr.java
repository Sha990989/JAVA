//int[] arr={19,10,12,6,4,3,9,4,5,3}
//o/p:-[3,5,9,12,19]
 // very important 
import java.util.ArrayList;
import java.util.List;

public class printhighestvalueinarr {
    public static void main(String[] args) {
        int[] arr={19,10,12,6,4,3,9,4,5,3};
        int max=0;
        List<Integer> result = new ArrayList<>();

        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>max){
                max=arr[i];
                result.add(max);
            }
        }
        System.out.println(result);
    }
    
}
