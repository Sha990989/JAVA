/*input= {10,20,30,8}
  output= Max value:8*/
public class findingminelementinarr {
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
    public static void main (String[] args){
        int[] arr={10,20,30,8};
        System.out.println("Max value :"+findMin(arr));
    }
}

