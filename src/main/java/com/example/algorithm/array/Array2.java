package com.example.algorithm.array;

import java.util.Scanner;

/**
 * 统计一个数在排序数组中出现的次数
 */
public class Array2 {

    public static void main(String[] args) {
        int num[] = new int[]{1, 2, 3, 4, 4, 5, 5, 5, 6, 7, 8, 9};
        for (int i : num) {
            if (i == num[num.length - 1]) {
                System.out.println(i);
            } else {
                System.out.print(i + ",");
            }
        }
        int len = num.length;
        System.out.println("请输入要找的元素：");
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int m = 0, n = 0;
        for (int i = 0; i < len; i++) {
            if (num[i] == t && m == 0) {
                m = i;
            }
            if (num[i] == t + 1 && n == 0) {
                n = i;
            }
        }
        System.out.println(t + "出现次数为：" + (n - m) + "次");
    }
}
