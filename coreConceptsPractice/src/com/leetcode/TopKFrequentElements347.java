package com.leetcode;

import java.util.*;

public class TopKFrequentElements347 {
    public static void main(String[] args) {
        int[] arr={1,1,1,2,2,3};
        int k=2;
        Map<Integer,Integer> map=new HashMap<>();
        for (int i:arr){
            int c=map.getOrDefault(i,0);
            map.put(i,c+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>((a,b)->a.getValue()-b.getValue());
        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            pq.add(e);
            if(pq.size()>k) pq.poll();
        }

        int[] res=new int[k];

        for (int i=0;i<k;i++){
            res[i]=pq.poll().getKey();
        }

        System.out.println(Arrays.toString(res));
    }
}
