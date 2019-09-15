package com.leetcode;

public class MaxProfit2 {

	public static void main(String[] args) {
		MaxProfit2 maxProfit = new MaxProfit2();
		System.out.println(maxProfit.maxProfit(new int[]{7,1,5,3,6,4}));
	}
	
	public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for(int i=0;i<prices.length;i++){
            if((i+1<prices.length) && prices[i+1]>prices[i]){
                maxProfit = maxProfit+ prices[i+1] - prices[i];
            }
        }
        return maxProfit;
    }

}
