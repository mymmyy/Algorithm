package com.mym.huawei;

import java.util.Scanner;

/**
 * 请编写一个函数（允许增加子函数），计算n x m的棋盘格子（n为横向的格子数，m为竖向的格子数）沿着各自边缘线从左上角走到右下角，
 * 总共有多少种走法，要求不能走回头路，即：只能往右和往下走，不能往左和往上走。
 */
public class 棋盘 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            long m = scanner.nextLong();
            long n = scanner.nextLong();

            System.out.println(qipan(m + 1, n + 1));
        }
    }

    private static long qipan(long m, long n) {
        if(m == 1 || n == 1){
            return 1;
        }
        // 两个决策：往下走或者往右走
        return qipan(m - 1, n) + qipan(m, n - 1);
    }
}
