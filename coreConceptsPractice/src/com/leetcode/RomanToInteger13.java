package com.leetcode;

import java.util.Map;

public class RomanToInteger13 {
    public static void main(String[] args) {
        Map<Character,Integer> map=Map.of(
                'I',1,
                'V',5,
                'X',10,
                'L',50,
                'C',100,
                'D',500,
                'M',1000
        );
        int val=0;
        String s="MCMXCIVI";
        char[] charArr=s.toCharArray();
        int i=0;
        for (i=0; i<charArr.length-1;i++){
            int currentVal=map.get(charArr[i]);
            int netVal=map.get(charArr[i+1]);
            if(netVal>currentVal){
                currentVal= netVal-currentVal;
                i++;
            }
            val+=currentVal;
        }
        if(i!=s.length()){
            val+=map.get(charArr[i]);
        }

        System.out.println(val);

    }
}
