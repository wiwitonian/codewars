package com.codewars.kyu8;

import java.util.Arrays;

public class MainMergedSortedIntegerArrays {
    public static void main(String[] args) {
        int[] a = MergedSortedIntegerArrays.mergeArrays(new int[] { 1, 1,1, 2, 4,4 ,4}, new int[] { 2, 2, 3, 3});
        String s = Arrays.toString(a);
    }
}
