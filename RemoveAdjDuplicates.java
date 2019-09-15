package com.leetcode;

import java.util.Stack;

public class RemoveAdjDuplicates {

	public static void main(String[] args) {
		System.out.println(removeDuplicates("abbbbbacaaa"));

	}
	
	public static String removeDuplicates(String S) {
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<S.length();i++){
            if(stack.isEmpty() || (!stack.isEmpty() && !stack.peek().equals(S.charAt(i)))){
                stack.push(S.charAt(i));
            }else if(stack.size()!=0){
                stack.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        for(Character myChar:stack){
            sb.append(myChar);
        }
        return sb.toString();
    }

}
