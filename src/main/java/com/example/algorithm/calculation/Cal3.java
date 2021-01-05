package com.example.algorithm.calculation;

import java.util.Scanner;

public class Cal3 {

    public static void main(String[] args) {
        System.out.println("请输入非负整数c：");
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();
        boolean bo = false;
        for (int a = 1; a < (Math.sqrt(c) + 1); a++) {
            for (int b = a + 1; b < (Math.sqrt(c) + 1); b++) {
                if (Math.pow(a, 2) + Math.pow(b, 2) == c) {
                    System.out.println(a + "*" + a + "+" + b + "*" + b + "=" + c);
                    bo = true;
                }
            }
        }
        System.out.println(bo);
    }
}
