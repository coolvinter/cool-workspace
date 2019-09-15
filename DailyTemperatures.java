package com.leetcode;

import java.util.Stack;

//Medium - tough algorithm
public class DailyTemperatures {

	public static void main(String[] args) {
		int [] nums = dailyTemperatures(new int[] {72,73,69,63,66,87,65,78});
		for(int temp :nums){
			System.out.print(temp + ",");
		}
	}
	
	public static int[] dailyTemperatures(int[] temperatures) {
		Stack<Integer> stack = new Stack<Integer>();
		int[] ret = new int[temperatures.length];
		for(int i=0;i<temperatures.length;i++){
			while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]){
				int idx = stack.pop();
				ret[idx] = i-idx;
			}
			stack.push(i);
		}
		return ret;
		
	}

}
