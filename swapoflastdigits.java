//int[] arr={1,2,3,4,5,6,7}
//target=3
//expected output=[7,6,5,1,2,3,4]



/*int[] arr={1,2,3,4,5,6,7};
        int target=4;
        int n=arr.length;
        int[] res=new int[n];
        int index=0;
        for(int i=target;i<n;i++){
            res[index++]=arr[i];
        }
        for(int i=0;i<target;i++){
            res[index++]=arr[i];
        }
        System.out.print("[");
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]);
            if(i<res.length-1){
                System.out.print(",");
            }
        }
        System.out.print("]");
    }*/
import java.util.Arrays;
public class swapoflastdigits {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};
        int target = 3;
        int targetIndex = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                targetIndex = i;
                break;
            }
        }
        int[] result = new int[a.length];
        int j = 0;
        for (int i = a.length - 1; i > targetIndex; i--) {
            result[j++] = a[i];
        }
        for (int i = 0; i <= targetIndex; i++) {
            result[j++] = a[i];
        }
        System.out.println(Arrays.toString(result));
    }
}

