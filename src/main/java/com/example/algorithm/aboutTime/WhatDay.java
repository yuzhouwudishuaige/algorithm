package com.example.algorithm.aboutTime;

import java.util.Calendar;
import java.util.Scanner;

//输入某年某月某日，判断这一天是这一年的第几天？
public class WhatDay {

    public static final void method1(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        System.out.println("这一天是这一年的第" + calendar.get(Calendar.DAY_OF_YEAR) + "天");
    }

    public static final void method2(int year, int month, int day) {
        int sumDay = 0, days = 0;
        for (int i = 1; i < month; i++) {
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    days = 31;
                    break;
                case 2:
                    if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                        days = 29;
                    } else {
                        days = 28;
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    days = 30;
                    break;
            }
            sumDay += days;
        }
        sumDay += day;
        System.out.println("这一天是这一年的第" + sumDay + "天");
    }

    public static void main(String[] args) {
        System.out.println("请输入年月日：");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        method1(year, month, day);
        method2(year, month, day);
    }
}
