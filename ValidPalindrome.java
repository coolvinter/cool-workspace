package com.leetcode;

public class ValidPalindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));

	}
	public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int i=0;int j=s.length()-1;
        while(i<j){
            if(!Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }else 
            if(!Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }else {
            	if(s.charAt(i)!=s.charAt(j)){
                    return false;
                }
                i++;j--;
            }
        }
        return true;
    }
}
