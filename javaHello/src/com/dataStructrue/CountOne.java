package com.dataStructrue;

public class CountOne {
    public void getResult(int n) {
        System.out.println(printNumberOfOne(n));
    }

    public int printNumberOfOne(int n) {
        if (n == 0) {
            return 0;
        } else {
            return printNumberOfOne(n / 2) + n % 2;
        }
    }
}
