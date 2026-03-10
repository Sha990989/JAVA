/*input:arr={10,20,30,5,8}
output:Max:30
       Min:5 
       total of array:73
       avaerage:14.6   */
public class minndmaxndtotalofelementsinarr {
    public static void main(String[] args){
        int[] arr={10,20,30,5,8};
        System.out.println("Max:"+findMax(arr));
        System.out.println("Min:"+findMin(arr));
        System.out.println("total of array:"+findTotal(arr));
        System.out.println("average:"+findAvg(arr));
    }
    public static int findMax(int[] arr){
        int max=arr[0];
        for(int num:arr){
            if(num>max){
                max=num;
            }
        }
        return max;
    }
     public static int findMin(int[] arr){
        int min=arr[0];
        for(int num:arr){
            if(num<min){
                min=num;
            }
        }
        return min;
    }
    public static int findTotal(int[] arr){
        int total=0;
        for(int num:arr){
        total=total+num;
        }
       return total;
    }
    public static double findAvg(int[] arr){   // average=sum/count
        return (double) findTotal(arr)/arr.length;  //type casting int to double 
    }
}
