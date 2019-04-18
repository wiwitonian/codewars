package com.codewars.kyu6;

public class MainPermutation {
    public static void main(String[] args) {
        Permutation p = new Permutation();
        String str = "ABCD";
        p.permute(str, 0, str.length()-1);
    }
}
