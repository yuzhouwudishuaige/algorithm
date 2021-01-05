package com.example.algorithm.array;

import java.util.Arrays;

/**
 * 扑克牌抓5张，判断是否连续，A为1，王为任意
 */
public class Array4 {

    public static final void method1(int num[]) {
        int t;
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] > num[j]) {
                    t = num[i];
                    num[i] = num[j];
                    num[j] = t;
                }
            }
        }
        boolean b = true;
        for (int k = 0; k < num.length; k++) {
            if (num[k] == 0) {
                continue;
            } else if (k != num.length - 1 && num[k] + 1 != num[k + 1]) {
                b = false;
            }
        }
        for (int l : num) {
            System.out.print(l + "->");
        }
        System.out.println(b);
    }

    public static void main(String[] args) {
        int num[] = new int[]{5, 6, 7, 7, 0, 4, 8};
        Arrays.sort(num);//数组排序
        method1(num);
    }
}
