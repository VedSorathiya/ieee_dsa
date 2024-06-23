package Day4;

import java.util.Arrays;

public class Leetcode238 {
    public static int[] productExceptSelf(int[] nums) {
        int arr[]=new int[nums.length];
        int x=1;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i==j){
                    continue;
                }
                x *= nums[j];
            }
            arr[i]=x;
        }
        return arr;
    }

//    public static void main(String args[]){
//        //Test cases
//        int a[] = {1,2,3,4};
//        System.out.println(Arrays.toString(productExceptSelf(a)));
//    }

}