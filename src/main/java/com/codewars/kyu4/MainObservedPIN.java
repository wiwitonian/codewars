package com.codewars.kyu4;

import java.util.List;

public class MainObservedPIN {
    public static void main(String[] args) {
        List<String> list = ObservedPin.getPINs("369");
        for(String s: list){
            System.out.println(s);
        }
    }
}
