package com.codewars.kyu8;

public class Counter {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        if(arrayOfSheeps == null || arrayOfSheeps.length == 0){
            return -1;
        }
        int numSheeps = 0;
        for(int i = 0; i < arrayOfSheeps.length; i++){
            if(arrayOfSheeps[i] == true)
                numSheeps++;
        }
        return numSheeps;
    }
}