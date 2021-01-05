package com.example.algorithm.print;

import java.util.Scanner;

/**
 * 输入一个不大于5位数的整数，求这是几位数，逆序打印
 */
public class Print3 {

    private static final void method1(int a) {
        String str = String.valueOf(a);
        String str1 = "";
        int len = str.length();
        for (int i = (len - 1); i >= 0; i--) {
            str1 += str.charAt(i);
        }
        System.out.println(a + "：位数为" + len + "位，逆序打印为：" + str1);
    }

    private static final void method2(int a) {
        int w = 0;
        String str = "";
        for (int i = 0; i <= 4; i++) {
            int b = (int) (a / Math.pow(10, i));
            if (b > 0) {
                w = i;
                String str1 = String.valueOf(b);
                if (str1.length() > 1) {
                    str += str1.charAt(str1.length() - 1);
                } else {
                    str += b;
                }
            }
        }
        System.out.println(a + "：位数为" + (w + 1) + "位，逆序打印为：" + str);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入不大于5位数的整数：");
        int a = scanner.nextInt();
        method1(a);
        method2(a);
    }
}

