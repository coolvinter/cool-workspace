package com.leetcode;

public class MonotonicIncrease {

	public static void main (String args[]){
		int[] one = new int[]{10,6,6,9};
		boolean result = isMonotonic(one);
		System.out.println(result);
		
	}
	
	public static boolean isMonotonic(int[] A) {
        boolean monotonicInc = true;
        boolean monotonicDec = true;
        int len = A.length;
        int i = 0;
        while(i+1<len){
        	if(A[i+1] == A[i]){
        	}else if(!(A[i+1]>A[i])){
        		monotonicInc = false;
        	}else{
        		monotonicDec = false;
        	}
        	i++;
        }
        return (monotonicInc || monotonicDec);
    }

}
