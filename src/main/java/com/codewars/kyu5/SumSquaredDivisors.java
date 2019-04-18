package com.codewars.kyu5;

import java.util.*;

public class SumSquaredDivisors {

    public static String listSquared(long m, long n) {
        HashMap<Long, Long> map = new HashMap<Long, Long>();
        for(long i = m; i <= n; i++){
            long sumSquared = sumOfSquaredDivisors(findDivisors(i));
            if(isPerfectSquare(sumSquared)){
                map.put(i, sumSquared);
            }
        }
        long[][] result = new long[map.size()][2];
        Set<Long> keySet = map.keySet();
        Long[] keys = keySet.toArray(new Long[keySet.size()]);
        Arrays.sort(keys);
        for(int i = 0; i < keys.length; i++){
            result[i][0] = keys[i];
            result[i][1] = map.get(keys[i]);
        }
        return Arrays.deepToString(result);
    }

    private static boolean isPerfectSquare(long n){
        boolean isPerfectSquare = false;
        if(n - (long)Math.floor(Math.sqrt(n))*(long)Math.floor(Math.sqrt(n)) == 0){
            isPerfectSquare = true;
        }else{
            isPerfectSquare = false;
        }
        return isPerfectSquare;
    }

    private static List<Long> findDivisors(long n){
        List<Long> list = new ArrayList<Long>();
        for(long i = 1; i <= n; i++){
            if(n % i == 0){
                list.add(i);
            }
        }
        return list;
    }

    private static long sumOfSquaredDivisors(List<Long> divisors){
        long sum = 0L;
        for(int i = 0; i < divisors.size(); i++){
            sum += divisors.get(i)*divisors.get(i);
        }
        return sum;
    }
}
