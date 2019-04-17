package com.codewars.kyu8;

public class WilsonPrime {
    public static boolean am_i_wilson(double n) {
        int p = (int)n;
        if(!isPrime(p))
            return false;
        if((factorial(p-1) + 1) % (p*p) == 0)
            return true;
        else
            return false;
    }

    public static int factorial(int n){
        if(n <= 0)
            return 1;
        else
            return n*factorial(n-1);
    }

    public static boolean isPrime(int n){
        int count = 0;
        if(n == 0 || n == 1)
            return false;
        else{
            for(int i = 2; i <= n; i++){
                if(n % i == 0)
                    count++;
            }
        }
        return count > 1 ? false: true;
    }
}
