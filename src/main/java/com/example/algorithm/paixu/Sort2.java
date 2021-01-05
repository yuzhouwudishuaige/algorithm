package com.example.algorithm.paixu;

/**
 * 10个数排序
 */
public class Sort2 {

    public static void main(String[] args) {
        int a[] = new int[]{2, 3, 6, 5, 4, 1, 7, 8, 9, 10};
        int max = a[0];
        int t;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] > max) {
                    t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        for (int j = 0; j < a.length; j++) {
            System.out.print(a[j] + ",");
        }
    }
}