package com.mym.huawei;

import java.util.Scanner;

/**
 *  题目描述
 * 把M个同样的苹果放在N个同样的盘子里，允许有的盘子空着不放，问共有多少种不同的分法？（用K表示）5，1，1和1，5，1 是同一种分法。
 * 输入
 *
 * 每个用例包含二个整数M和N。0<=m<=10，1<=n<=10。
 *
 *
 * 样例输入
 * 7 3
 * 样例输出
 * 8
 */
public class 放苹果 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            System.out.println(count(m, n));
        }
    }

    /**
     *
     * @param m 个苹果
     * @param n 个盘子
     * @return
     */
    public static int count(int m, int n){
        // 没苹果了，或者盘子只剩最后一个，算一次
        if(m == 0 || n == 1){
            return 1;
        } else if(m < n){
            // 苹果个数小于盘子的个数时，把多余的盘子丢弃，因为 如题所述，1 5 0 1 和 1 0 5 1 只能算1次
            return count(m, m);
        } else {
             /*
                放苹果分为两种情况，一种是有盘子为空，一种是每个盘子上都有苹果。
                令(m,n)表示将m个苹果放入n个盘子中的摆放方法总数。
                1.假设有一个盘子为空，则(m,n)问题转化为将m个苹果放在n-1个盘子上，即求得(m,n-1)即可
                2.假设所有盘子都装有苹果，则每个盘子上至少有一个苹果，即最多剩下m-n个苹果，问题转化为将m-n个苹果放到n个盘子上
                即求(m-n，n)

                综上所述：
                (m，n)=(m,n-1)+(m-n,n);
            */
            return count(m, n - 1) + count(m - n, n);
        }

    }
}
