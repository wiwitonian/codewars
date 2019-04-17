package com.codewars.kyu8;

public class YouOnlyNeedOne {
    public static boolean check(Object[] a, Object x) {
        boolean result = false;
        for(int i = 0; i < a.length; i++){
            if(x instanceof Integer && a[i] instanceof Integer){
                if(((Integer)x).intValue() == ((Integer)a[i]).intValue())
                    result = true;
            }else if(x instanceof String && a[i] instanceof String){
                if(((String)x).equals(((String)a[i])))
                    result = true;
            }else if(x instanceof Character && a[i] instanceof Character){
                if(((Character)x).charValue() == ((Character)a[i]).charValue()){
                    result = true;
                }
            }
        }
        return result;
    }
}
