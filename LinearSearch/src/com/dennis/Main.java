package com.dennis;

public class Main {
    public static void main(String[] args) {
        int[] nums = {23,45,1,2,8,19,-3,16,-11,2};
        int target = 19;
        int ans = linearSearch(nums,target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if(element == target) {
                return i;
            }
        }

        return -1;
    }
}