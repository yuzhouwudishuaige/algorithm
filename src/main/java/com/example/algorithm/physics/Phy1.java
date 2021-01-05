package com.example.algorithm.physics;

import java.util.Scanner;

/**
 * 小球从高空100米自由落下，每次都反弹原来一半
 * 再落下，求第10次落地共经过多少米，第10次反弹多高
 */
public class Phy1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入初始高度和第几次落地（分别代表题目的100米和第十次）：");
        int h = scanner.nextInt();
        int n = scanner.nextInt();
        double fh = h / 2;
        double dis = h;
        for (int i = 2; i <= n; i++) {
            fh = h / Math.pow(2, i);
            dis = dis + h / Math.pow(2, i - 1) * 2;
        }
        System.out.println("第" + n + "次落地共经过" + dis + "米");
        System.out.println("第" + n + "次弹起来的高度为：" + fh);
    }
}
