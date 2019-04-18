package com.codewars.kyu8;

import java.util.ArrayList;
import java.util.List;

public class MergedSortedIntegerArrays {
    public static int[] mergeArrays(int[] first, int[] second) {
        List<Integer> list = new ArrayList<Integer>();
        int i = 0;
        int j = 0;
        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                while(i < first.length-1 && first[i] == first[i+1])i++;
                while(j < second.length-1 && second[j] == second[j+1])j++;
                list.add(first[i]);
                i++;
            }else if(first[i] == second[j]){
                while(i < first.length-1 && first[i] == first[i+1])i++;
                while(j < second.length-1 && second[j] == second[j+1])j++;
                list.add(first[i]);
                i++;
                j++;
            }else{
                while(i < first.length-1 && first[i] == first[i+1])i++;
                while(j < second.length-1 && second[j] == second[j+1])j++;
                list.add(second[j]);
                j++;
            }
        }
        if(i >= first.length && j < second.length){
            while(j < second.length){
                while(j < second.length-1 && second[j] == second[j+1])j++;
                list.add(second[j]);
                j++;
            }
        }else if(j >= second.length && i < first.length){
            while(i < first.length){
                while(i < first.length-1 && first[i] == first[i+1])i++;
                list.add(first[i]);
                i++;
            }
        }

        //extract list to int[]
        int[] result = new int[list.size()];
        for(int k = 0; k < result.length; k++)
            result[k] = list.get(k);
        return result;
    }
}
