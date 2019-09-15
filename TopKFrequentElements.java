package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

//Medium - Important!!
public class TopKFrequentElements {

	public static void main(String[] args) {
		List<Integer> list = topKFrequent(new int []{4,1,-1,2,-1,2,3}, 2);
		for(int i:list){
			System.out.println(i);
		}
	}
	
	public static List<Integer> topKFrequent(int[] nums, int k) {
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }else{
                map.put(nums[i], map.get(nums[i])+1);
            }
        }
        List<Integer>[] bucket = new List[nums.length+1];
        for(int key: map.keySet()){
            int frequency = map.get(key);
            if(bucket[frequency]==null){
                bucket[frequency] = new LinkedList<Integer>();
            }
            bucket[frequency].add(key);
        }
        List<Integer> response = new ArrayList<Integer>();
        for(int i=bucket.length-1;i>=0 && k>0;i--){
        	if(bucket[i]!=null){
                 List<Integer> list = bucket[i];
        		 response.addAll(list);
        	}
        }
        return response.subList(0, k);
    }

}
