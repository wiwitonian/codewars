package com.codewars.kyu6;

public class MainAreTheyTheSame {
    public static void main(String[] args) {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        System.out.println(AreTheyTheSame.comp(a,b));
    }
}
