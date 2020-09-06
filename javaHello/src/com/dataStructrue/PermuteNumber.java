package com.dataStructrue;

public class PermuteNumber {
    public void permute(int[] arr, int n) {
        int[] result = new int[n];
        permute(arr, n, result, 0, arr.length - 1);
    }

    public void permute(int[] arr, int n, int[] res, int index, int indexA) {
        if (arr.length < n) return;
        if (n == 0) {
            for (int i : res) {
                System.out.print(i + " ");
            }
            System.out.println();
        } else {
            if(indexA<0) return;
            res[index] = arr[indexA];
            permute(arr, n - 1, res, index + 1, indexA - 1);
            permute(arr, n, res, index, indexA - 1);
        }

    }


}
