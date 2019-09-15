package com.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayIntersection349 {
	
	public static void main (String args[]){
		int[] one = new int[]{1,2,2,1};
		int[] two = new int[]{2,2};
		int[] result = intersection(one, two);
		for(int i=0;i<result.length;i++){
			System.out.println(result[i]);
		}
		
	}
	
    public static int[] intersection(int[] nums1, int[] nums2) {
    	Arrays.sort(nums1);
    	Arrays.sort(nums2);
    	int i = 0,j = 0;
    	Set<Integer> result = new HashSet<Integer>();
    	while(i<nums1.length && j<nums2.length){
    		if(nums1[i]<nums2[j]){
    			i++;
    		}
    		else if(nums2[j]<nums1[i]){
    			j++;
    		}else{
    			result.add(nums1[i]);
    			i++;
    			j++;
    		}
    	}
    	int[] arr = new int[result.size()];
    	int k=0;
		for(Integer num: result){
    		arr [k] = num;
    	}
    	
        return arr;
    }
}
