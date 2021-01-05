package com.example.algorithm.calculation;

/**
 * 猴子第一天摘若干个桃子，第一天吃了一半+1个，第二天吃了剩下的一半+一个，第十天早上剩下一个（还没吃）
 * 求第一天摘了多少个
 */
public class Cal2 {

    public static void main(String[] args) {
        int sum = 1;
        for (int i = 1; i < 10; i++) {
            sum = (sum + 1) * 2;
        }
        System.out.println("第一天共摘桃" + sum + "个");
    }
}
