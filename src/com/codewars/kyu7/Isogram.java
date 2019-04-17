package com.codewars.kyu7;

import java.util.Set;
import java.util.HashSet;

public class Isogram {
    public static boolean isIsogram(String str) {
        Set<Character> set = new HashSet<>();
        str = str.toLowerCase();
        boolean isIsogram = true;
        for(int i = 0; i < str.length(); i++){
            if(set.contains(str.charAt(i))){
                isIsogram = false;
                break;
            }
            set.add(str.charAt(i));
        }
        return isIsogram;
    }
}