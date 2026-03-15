package com.leetcode;

public class VerifyingAnAlienDictionary953 {
    public static void main(String[] args) {
        String[] words={"apple","app"};
        String order = "abcdefghijklmnopqrstuvwxyz";
        int[] arr=new int[26];
        int i=0;
        for (int c : order.toCharArray()){
            arr[c-'a']=i;
            i++;
        }

        for (int j=1;j<words.length;j++){
            if(!isInOrder(words[j-1],words[j],arr)){ System.out.println(false); break;}
        }
        System.out.println(true);
    }

    static boolean isInOrder(String str1, String str2, int[] arr){
        int i=0,j=0;
        while (i<str1.length() && j<str2.length()){
            if(arr[str1.charAt(i) - 'a'] > arr[str2.charAt(j)-'a']){
                return false;
            }else if(arr[str1.charAt(i) - 'a'] < arr[str2.charAt(j)-'a']){
                return true;
            }
            i++;j++;
        }

        if(str1.length()>str2.length()) return false;

        return true;
    }
}
