package com.dataStructrue;

public class PermuteFunction {
    public void permute(String str) {
        permute(str, 0, str.length());
    }

    public void permute(String str, int low, int high) {
        if (low == high - 1) System.out.println(str);
        else {

            for (int i = low; i < high; ++i) {
                str = swap(str, i, low);
                permute(str, low + 1, high);
//                str = swap(str, i, low);
            }
        }

    }

    public String swap(String str, int index, int first) {
        StringBuilder stringBuilder = new StringBuilder(str);
        String temp = str.substring(first, first + 1);
        stringBuilder.replace(first, first + 1, stringBuilder.substring(index, index + 1));
        stringBuilder.replace(index, index + 1, temp);
        return stringBuilder.toString();
    }
}
