package com.example.algorithm.calculation;

import java.util.Scanner;

/**
 * 求a+aa+aaa+...+....a的值，a多少个输入,a值输入，比如（2+22+222+2222+22222，a=2,b=5);
 */
public class Cal1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入值：a,和算式中的因子个数b：");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 0, s = 0, sum1 = 0;
        String s1 = "";
        for (int j = 0; j < b; j++) {
            s += a * Math.pow(10, j);
            sum += s;
            s1 += s + "+";
        }
        for (int k = 1; k <= b; k++) {
            for (int i = b - k; i >= 0; i--) {
                sum1 += a * Math.pow(10, i);
            }
        }
        System.out.println(s1.substring(0, s1.length() - 1) + "=" + sum);
        System.out.println(sum1);
    }
}
