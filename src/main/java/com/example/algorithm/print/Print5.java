package com.example.algorithm.print;

import java.util.Scanner;

/**
 * 打印杨辉三角
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 1 4 6 4 1
 * 1 5 10 10 5 1
 * 1 6 15 20 15 6 1
 */
public class Print5 {

    public static void main(String[] args) {
        System.out.println("请输入要打印的行数：");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println(i);

            }
        }
    }
}


/**
 * 1和5不同
 * 4,8,7,9选项不同
 * <p>
 * 1 2 3 4 5 6 7 8 9 10
 * c a   a     a   a
 */
