package com.leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] arr={"eat","tea","tan","ate","nat","bat"};
        Map<String,List<String>> map=new HashMap<>();

        for (String s: arr){
            int[] xArr=new int[26];
            for(char c: s.toCharArray())xArr[c-'a']++;
            String key=Arrays.toString(xArr);
            List<String> temp=map.getOrDefault(key,new ArrayList<>());
            temp.add(s);
            map.put(key,temp);
        }


//        List<List<String>> map=Arrays.stream(arr).collect(Collectors.groupingBy((a)->{
//            int[] xArr=new int[26];
//            for(char c: a.toCharArray())xArr[c-'a']++;
//            return Arrays.toString(xArr);
//        })).values().stream().toList();



        System.out.println(map.values());


    }
}
