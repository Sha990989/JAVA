public class LinearSearch {
    public static int search(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target)
                return i;
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr={7,30,28,72,27}; //user input
        int key=28; //user input
        System.out.println("Array fount at index:"+search(arr,key));
        key=2;
        System.out.println("Array fount at index:"+search(arr,key));
    }
}
