package com.example.algorithm.string;

/**
 * 1.将字符串旋转n位
 * 2.翻转句子eg: i am a superman -> superman a am i
 * 3.翻转单词eg: i am a superman -> namrepus a ma i
 */
public class Str2 {


    public static final void method1() {
        String str = "abcdefg";
        int n = 2;
        System.out.println(str.substring(n, str.length()) + str.substring(0, n));
    }

    public static final void method2() {
        String str = "i am a superman";
        String str1[] = str.split(" ");
        for (int i = str1.length - 1; i >= 0; i--) {
            System.out.print(str1[i] + " ");
        }
        System.out.println();
    }

    public static final void method3() {
        String str = "i am a superman";
        char c[] = str.toCharArray();
        for (int i = c.length - 1; i >= 0; i--) {
            System.out.print(c[i]);
        }
    }

    public static void main(String[] args) {
        method1();
        method2();
        method3();
    }
}
