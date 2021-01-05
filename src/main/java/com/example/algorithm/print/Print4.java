package com.example.algorithm.print;

/**
 * 打印出数组中唯一不重复的值
 */
public class Print4 {

    public static void main(String[] args) {
        int num[] = new int[]{1, 1, 2, 3, 3, 4, 4, 5, 5, 6, 6};
        for (int i = 0; i < num.length; i++) {
            int count = 0;
            for (int j = 0; j < num.length; j++) {
                if (num[i] == num[j] && i != j) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("这个数是：" + num[i]);
                break;
            }
        }
    }
}
