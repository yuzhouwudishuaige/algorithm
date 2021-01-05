package com.example.algorithm.string;

import java.util.Scanner;

/**
 * 输入一行字符，输出小写字母个数、大写字母个数、空格个数、其他字符个数
 **/
public class Str1 {

    public static void main(String[] args) {
        System.out.println("请输入字符串：");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int a = 0, b = 0, e = 0, d = 0;
        char c[] = str.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] >= 'a' && c[i] <= 'z') {
                a++;
            } else if (c[i] >= 'A' && c[i] <= 'Z') {
                b++;
            } else if (c[i] == ' ') {
                e++;
            } else {
                d++;
            }
        }
        System.out.println("小写：" + a + ",大写：" + b + ",空格：" + e + ",其他：" + d);
    }
}
