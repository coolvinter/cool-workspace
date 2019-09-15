package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class CommonChars {

	public static void main(String[] args) {
		List<String> list = commonChars(new String[]{"bella","label", "roller"});
		for(String each:list){
			System.out.print(each + ",");
		}
	}
	
	public static List<String> commonChars(String[] A) {
		List<String> list = new ArrayList<String>();
		int[] charCounts = new int[26];
		for(char eachChar:A[0].toCharArray()){
			charCounts[eachChar - 'a']++;
		}
		
		//Do count for rest
		charCounts = getCount(A, charCounts);
		for(int i=0;i<26;i++){
			if(charCounts[i] > 0){
				for(int j=0;j<charCounts[i];j++){
					list.add((char)(i+'a') + "");
				}
			}
		}
		return list;
		
	}

	private static int[] getCount(String[] A, int[] charCounts) {
		for(int i=1;i<A.length;i++){
			int[] restCharCounts = new int[26];
			for(char eachChar:A[i].toCharArray()){
				restCharCounts[eachChar-'a']++;
			}
			charCounts = findMinimum(restCharCounts,charCounts);
		}
		return charCounts;
	}

	private static int[] findMinimum(int[] restCharCounts, int[] charCounts) {
		for(int i=0;i<26;i++){
			charCounts[i] = Math.min(restCharCounts[i], charCounts[i]);
		}
		return charCounts;
	}
}
