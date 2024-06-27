package Day7;

import java.util.*;
public class Leetcode3 {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int max=0;
        int[] arr = new int[1000];
        Arrays.fill(arr,-1);
        int l = 0;
        for (int r=0;r<n;r++){
            if (arr[s.charAt(r)]>=l){
                l = arr[s.charAt(r)]+1;
            }
            arr[s.charAt(r)] = r;
            max = Math.max(max,r-l+1);
        }
        return max;
    }
}
