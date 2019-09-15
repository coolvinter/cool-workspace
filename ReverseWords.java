package com.leetcode;

public class ReverseWords {

	public static void main(String[] args) {
		System.out.println(reverseWords("a good   example"));
	}
	
	public static String reverseWords(String s) {
        String[] strArr = s.split(" ");
        int length = strArr.length;
        StringBuilder sb = new StringBuilder();
        for(int i=length-1;i>=0;i--){
        	if(!strArr[i].trim().equals("")){
        		sb.append(strArr[i].trim()).append(" ");
        	}
        }
        return sb.toString().trim();
    }

}
