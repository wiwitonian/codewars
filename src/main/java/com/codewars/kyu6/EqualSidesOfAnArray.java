package com.codewars.kyu6;

public class EqualSidesOfAnArray {
    /*
    public static int findEvenIndex(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            if(sum(arr,0,i-1) == sum(arr,i+1,arr.length-1))
                return i;
        }
        return -1;
    }

    private static int sum(int[] arr, int left, int right){
        if(arr.length == 0 || left < 0 || left >= arr.length || right < 0|| right >= arr.length){
            return 0;
        }else if(left == right){
            return arr[left];
        }else{
            int sum = 0;
            for(int i = left; i <= right; i++){
                sum += arr[i];
            }
            return sum;
        }
    }
    */
}
