package com.leetcode;

public class MoveZeroes {

	public static void main(String[] args) {
		int [] nums = moveZeroes(new int[] {0,1,0,3,12,0,27});
		for(int i:nums){
			System.out.println(i);
		}
	}
	public static int[] moveZeroes(int[] nums) {
		int j=0;//variable to keep index to insert if it is non zero
		for(int i=0;i<nums.length;i++){
			if(nums[i]!=0){
				int temp = nums[j];
				nums[j] = nums[i];
				nums[i] = temp;
				j++;
			}
		}
	    return nums;
    }
}
