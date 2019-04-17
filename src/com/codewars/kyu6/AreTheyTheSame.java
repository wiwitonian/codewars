package com.codewars.kyu6;

public class AreTheyTheSame {
    public static boolean comp(int[] a, int[] b) {
        if(a.length == 0 && b.length == 0)
            return true;
        if(a == null || b == null || a.length == 0 || b.length == 0){
            return false;
        }
        boolean isEqual = true;
        boolean found = false;
        int[] a2 = new int[a.length];
        for(int i = 0; i < a.length; i++){
            a2[i] = a[i]*a[i];
        }
        for(int i = 0; i < b.length; i++){
            found = false;
            for(int j = 0; j < a.length; j++){
                if(b[i] == a2[j]){
                    found = true;
                    break;
                }
            }
            if(!found){
                isEqual = false;
                break;
            }
        }
        return isEqual;

        /*
        boolean result = true;
        if(a.length == 0 && b.length == 0)
            return true;
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
        */
    }
}
