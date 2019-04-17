package com.codewars.kyu6;

public class Permutation {

    public void permute(String str, String chosen){
        if(chosen.isEmpty()){
            System.out.println(str);
        }else{
            for(int i = 0; i < str.length(); i++){
                //choose
                char ch = str.charAt(i);
                chosen += ch;
                str = str.substring(i + 1);
                //explore
                permute(str, chosen);
                //unchoose
                str = str;
                chosen = chosen.substring(i, chosen.length()-1);
            }
        }
    }

    public void permute(String str, int left, int right){
        if(left == right){
            System.out.println(str);
        }else{
            for(int i = left; i <= right; i++){
                str = swap(str, left, i);//choose
                permute(str, left+1, right);//explore
                str = swap(str, i, left);
            }
        }
    }

    private String swap(String str, int i, int j) {
        if(i == j){
            return str;
        }
        StringBuffer strb = new StringBuffer(str);
        char temp = strb.charAt(j);
        strb.deleteCharAt(j);
        strb.insert(i, temp);
        return strb.toString();
    }
}
