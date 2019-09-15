package com.leetcode;

public class ValidAnagram {

	public static void main(String[] args) {
		System.out.println(isAnagram("a", "b"));
	}
	
	public static boolean isAnagram(String s, String t) {
        int[] freqArray = new int[128];
        for(int i=0;i<s.length();i++){
            freqArray[s.charAt(i) - 'a']++;
        }
        for(int i=0;i<t.length();i++){
            freqArray[t.charAt(i) - 'a']--;
        }
        for(int i:freqArray){
            if(i!=0){
                return false;
            }
        }
        return true;
    }

}
