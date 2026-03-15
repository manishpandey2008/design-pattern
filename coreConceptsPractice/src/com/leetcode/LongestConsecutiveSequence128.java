package com.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LongestConsecutiveSequence128 {
    public static void main(String[] args) {
        int[] nums={0,3,7,2,5,8,4,6,0,1};
        Set<Integer> set= new HashSet <>();
        for(int n : nums) set.add(n);
        int res=1;

        Iterator<Integer> it= set.iterator();;
        while (it.hasNext()){
            int x= it.next();
            int cRes=1;
            if(!set.contains(x-1)){
                for(int i=x+1;set.contains(i);i++){
                    cRes++;
                }
            }
            if(cRes>res)res=cRes;
        }
        System.out.println(res);
    }
}
