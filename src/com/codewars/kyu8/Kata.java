package com.codewars.kyu8;

public class Kata
{
    public static boolean comp(int[] a, int[] b) {
        boolean result = true;
        if(a == null || b == null || a.length == 0 || b.length == 0){
            return false;
        }
        for(int x: b){
            int root = (int)Math.sqrt(x);
            boolean found = false;
            for(int y: a){
                if(root == y)
                    found = true;
            }
            if(!found){
                result = false;
                break;
            }
        }
        return result;
    }
}
