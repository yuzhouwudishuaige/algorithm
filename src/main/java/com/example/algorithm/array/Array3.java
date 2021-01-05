package com.example.algorithm.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 0-(n-1)个数，每次删除第m个数（从0开始），求最后剩下的数
 * 比如：n=5,m=3.数组：0,1,2,3,4；删除2、0、4、1，剩下3
 */
public class Array3 {

    public static final void method1(int n, int m) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        for (int i = 0; i < list.size(); i++) {

        }
    }

    public static final void method2(int n, int m) {
        int last = 0;
        for (int i = 2; i <= n; i++) {
            last = (last + m) % i;
        }
        System.out.println(last);
    }

    public static void main(String[] args) {
        method2(5, 2);
    }
}
