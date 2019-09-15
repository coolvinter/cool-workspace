package com.leetcode;

public class ValidPalindrome2 {

	public static void main(String[] args) {
		System.out.println(validPalindrome("daaafad"));

	}
	
    public static boolean validPalindrome(String s){
        int i = 0,j=s.length()-1;
        while(i<j){
        	if(s.charAt(i)!=s.charAt(j)){
        		return isValidPalindrome(s,i+1,j) || isValidPalindrome(s,i,j-1);
        	}
        	i++;j--;
        }
		return true;
    }

	private static boolean isValidPalindrome(String s, int i, int j) {
		while(i<j){
			if(s.charAt(i)!=s.charAt(j)){
				return false;
			}
			i++;j--;
		}
		return true;
	}
}
