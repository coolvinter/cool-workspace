package com.leetcode;

public class MaximumSubarray {
// Problem 53
	public static void main(String[] args) {
		System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
	}
	
	public static int maxSubArray(int[] nums) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE, i = 0;
        while(i<nums.length){
            sum = sum + nums[i];
            if(sum > maxSum){
                maxSum = sum;
            }else{
                sum = 0;
            }
            i++;
        }
        return maxSum;
    }

}
