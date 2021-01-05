package com.example.algorithm.array;

import java.util.Scanner;

/**
 * 在排序数组中找出元素的第一个和最后一个的位置
 * num【1,2,3,4,4,5,6】 ，t=6， 输出：6,6
 * t=7，输出：-1，-1
 */
public class Array1 {

    private static final void method1(int[] num, int t) {
        int i = 0, j = num.length - 1;
        int k = helper(num, t, i, j);
        int l = helper(num, t - 1, i, j);
        System.out.println("[" + k + "," + (k + 1) + "]");
        System.out.println(k + "," + j);
    }

    private static int helper(int[] nums, int t, int i, int j) {
        while (i <= j) {
            int mid = (i + j) >> 1;
            if (nums[mid] <= t) i = mid + 1;
            else j = mid - 1;
        }
        return i;
    }

    private static final void method2(int num[], int t) {
        int len = num.length;
        int i = -1, j = -1;
        for (int m = 0; m < len; m++) {
            if (num[m] == t && i == -1) {
                i = m;
                continue;
            }
            if (num[m] == t && i != -1) {
                j = m;
            }
        }
        if (i != -1 && j == -1) {
            j = i;
        }
        System.out.println("[" + i + "," + j + "]");
    }

    public static void main(String[] args) {
        int num[] = new int[]{1, 2, 3, 4, 4, 4, 5, 6, 7, 8, 9};
        for (int i : num) {
            if (i == num[num.length - 1]) {
                System.out.println(i);
            } else {
                System.out.print(i + ",");
            }
        }
        System.out.println("请输入要找的元素：");
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        method1(num, t);
        method2(num, t);
    }
}
