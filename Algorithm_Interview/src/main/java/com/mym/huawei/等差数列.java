package com.mym.huawei;

import java.util.Scanner;

/**
 * 功能:等差数列 2，5，8，11，14。。。。
 * <p>
 * 输入:正整数N >0
 * <p>
 * 输出:求等差数列前N项和
 * <p>
 * 返回:转换成功返回 0 ,非法输入与异常返回-1
 * <p>
 * n(a1 + d(n - 1))/2
 */
public class 等差数列 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            long m = scanner.nextLong();
            System.out.println(dengcha(m));
        }
    }

    private static long dengcha(long m) {
        if(m == 1){
            return 2;
        }
        return dengcha(m - 1) + (2 + 3 * (m - 1));
    }
}
