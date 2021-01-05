package com.example.algorithm.print;

import java.util.Scanner;

/**
 * 打印菱形◇
 */
public class Print2 {

    public static void main(String[] args) {
        System.out.println("请输入菱形的行（奇数）：");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//输入的行数
        System.out.println("输入表示菱形的符号：");
        String str = scanner.next();
        int m = (n + 1) / 2;//上半部分行数（包括中间一行）
        int max = n;//最大*个数
        for (int i = 1; i <= m; i++) {
            for (int j = 0; j < (m - i); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print(str);
            }
            System.out.print("\n");
        }
        for (int i = m + 1; i <= n; i++) {
            for (int j = 0; j < (m - max + i - 1); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * (max - i + 1) - 1; k++) {
                System.out.print(str);
            }
            System.out.print("\n");
        }
    }
}
