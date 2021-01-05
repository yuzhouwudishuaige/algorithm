package com.example.algorithm;

import java.util.Scanner;

/**
 * 企业发放的奖金根据利润提成，利润（i)低于十万，奖金提高10%，
 * 高于十万，低于20万，低于10万的部分提10%，高于10万的部分提7.5%
 * 20-40万，高于20万的部分提5%
 * 高于40万，提3%
 * 高于60万，提1.5%
 * 高于100万，提1%，输入利润求奖金
 */
public class Profit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double money = 0.0;
        while (true) {
            System.out.println("请输入利润（单位万元）：");
            Double i = scanner.nextDouble();
            Double a = (i - 100) * 0.01;
            if (a > 0) {
                money = 10 * 0.1 + 10 * 0.075 + 20 * 0.05 + 20 * 0.03 + 20 * 0.015 + a;
            } else {
                a = (i - 60) * 0.15;
                if (a > 0) {
                    money = 10 * 0.1 + 10 * 0.075 + 20 * 0.05 + 20 * 0.03 + a;
                } else {
                    a = (i - 40) * 0.03;
                    if (a > 0) {
                        money = 10 * 0.1 + 10 * 0.075 + 20 * 0.05 + a;
                    } else {
                        a = (i - 20) * 0.05;
                        if (a > 0) {
                            money = 10 * 0.1 + 10 * 0.075 + a;
                        } else {
                            a = (i - 10) * 0.075;
                            if (a > 0) {
                                money = 10 * 0.1 + a;
                            } else {
                                money = i * 0.1;
                            }
                        }
                    }
                }
            }
            System.out.println("计算出你的奖金为（单位万元）：" + money);
            System.out.println("请选择是否继续（y or n)：");
            String str = scanner.next();
            if (str.equals("n")) {
                System.out.println("感谢使用,bye...");
                break;
            }
        }
    }
}
