import java.util.*;
public class rightrotation 
{
    public static void main(String args[])
    {
        int nums[]={1,2,3,4,5,6,7};
        int n=nums.length;
        int k=2;
        int temp[]=new int[n];
        for(int i=0;i<n;i++)
        {
            temp[(i+k)%n]=nums[i];    
        }
        System.arraycopy(temp,0,nums,0,n);
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]+" ");
        }
    }
    
}
