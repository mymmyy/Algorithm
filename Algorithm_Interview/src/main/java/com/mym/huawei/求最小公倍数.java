package com.mym.huawei;

import java.util.Scanner;

/**
 * 正整数A和正整数B 的最小公倍数是指 能被A和B整除的最小的正整数值，设计一个算法，求输入A和B的最小公倍数。
 * 递归求解
 */
public class 求最小公倍数 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            while (scanner.hasNext()) {
                long m = scanner.nextLong();
            long n = scanner.nextLong();
            long st = System.currentTimeMillis();
            System.out.println(minG(m, n, m, n));
//            System.out.println("耗时："+ (System.currentTimeMillis() - st));
        }
    }

    private static long minG(long oldm, long oldn, long m, long n) {
        if(m / oldn > 0 && m % oldn == 0){
            return m;
        } else if(n / oldm > 0 && n % oldm == 0){
            return n;
        } else if(oldm > oldn){
           return minG(oldm, oldn, m + oldm, n);
        }else{
            return minG(oldm, oldn, m, n + oldn);
        }
    }
}
