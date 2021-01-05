package com.example.algorithm;

/**
 * 一个整数，它加上100后是一个完全平方数，加上168又是一个完全平方数，请问该数是多少？
 */
public class SquareNum {

    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++) {
            Double a = (Math.sqrt(100 + i)) % 2;
            Double b = (Math.sqrt(168 + i)) % 2;
            if ((a == 1 || a == 0) && (b == 1 || b == 0)) {
                System.out.println("这个数是：" + i + ",加上100是：" + (100 + i) + "完全平方是：" + Math.sqrt(100 + i) + "," +
                        "加上168是：" + (168 + i) + "完全平方是：" + Math.sqrt(168 + i));
                break;
            }
        }
    }
}
