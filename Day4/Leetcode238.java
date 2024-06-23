package Day4;

import java.util.Arrays;

public class Leetcode238 {
    public static int[] productExceptSelf(int[] nums) {
        int x=nums.length;
        int left[] = new int[x];
        int right[] = new int[x];
        Arrays.fill(left,1);
        Arrays.fill(right,1);
        for(int i=1;i<x;++i){
            left[i] = left[i-1]*nums[i-1];
        }
        for(int i=x-2;i>=0;--i){
            right[i] = right[i+1]*nums[i+1];
        }
        int arr[] = new int[x];
        for(int i=0;i<x;++i){
            arr[i] = left[i]*right[i];
        }
        return arr;
    }
//    public static void main(String args[]){
//        //Test cases
//        int a[] = {1,2,3,4};
//        System.out.println(Arrays.toString(productExceptSelf(a)));
//    }

}
