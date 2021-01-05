package com.example.algorithm;

import java.util.*;

/**
 * 有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
 * 123 124 132 134 142 143
 * 213 214 231 234 241 243
 * 312 314 321 324 341 342
 * 412 413 421 423 431 432
 */
public class GroupThreeNum {

    /**
     * 任何数字都行
     *
     * @param list
     */
    public static void method1(List list) {
        int len = list.size();
        int count = len * (len - 1) * (len - 2);
        Random random = new Random();
        Set set = new HashSet();
        for (int i = 0; i < count; ) {
            List list1 = new ArrayList(list);
            StringBuilder sb = new StringBuilder();
            int a = random.nextInt(len);
            sb.append(list.get(a));
            list1.remove(a);
            int b = random.nextInt(list1.size());
            sb.append(list1.get(b));
            list1.remove(b);
            int c = random.nextInt(list1.size());
            sb.append(list1.get(c));
            set.add(Integer.parseInt(sb.toString()));
            i = set.size();
        }
        System.out.println(set + "个数：" + set.size()
        );
    }

    /**
     * 局限于1,2,3,4这种连续的
     *
     * @param list
     */
    public static void method2(List list) {
        int count = 0;
        for (int i = 1; i <= list.size(); i++) {
            for (int j = 1; j <= list.size(); j++) {
                for (int k = 1; k <= list.size(); k++) {
                    if (i != j && j != k && i != k) {
                        System.out.print(100 * i + 10 * j + k + ",");
                        count++;
                    }
                }
            }
        }
        System.out.println("个数：" + count);
    }

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        method1(list);
        method2(list);
    }
}
