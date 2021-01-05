package com.example.algorithm.paixu;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 输入三个整数x,y,z，请把这三个数由小到大输出。
 */
public class Sort1 {

    public static final void method1(int x, int y, int z) {
        int min = Math.min(Math.min(x, y), Math.min(y, z));
        int max = Math.max(Math.max(x, y), Math.max(y, z));
        int middle = 0;
        if (x != max && x != min) middle = x;
        if (y != max && y != min) middle = y;
        if (z != max && z != min) middle = z;
        System.out.println(min + "," + middle + "," + max);
    }

    public static final void method2(int x, int y, int z) {
        int a[] = new int[3];
        a[0] = x;
        a[1] = y;
        a[2] = z;
        int t;
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (a[i] > a[j]) {
                    t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        for (int k = 0; k < 3; k++) {
            System.out.print(a[k] + ",");
        }
    }

    public static final void method3(Scanner scanner) {
        int a[] = new int[3];
        for (int i = 0; i < 3; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        for (int j = 0; j < a.length; j++) {
            System.out.print(a[j] + ",");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入三个整数：");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        method1(x, y, z);
        method2(x, y, z);
        method3(scanner);
    }
}
