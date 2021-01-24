package com.mym.huawei;

import java.util.Scanner;
import java.util.TreeSet;

public class MingMingRandom {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int curNum = 0;
        TreeSet<Integer> curSet = new TreeSet<Integer>();
        while (scanner.hasNext()) {
            if(curNum == 0){
                int v = scanner.nextInt();
                if(v <= 1000){
                    curNum = v;
                }
                continue;
            }
            while(curNum > 0){
                curSet.add(scanner.nextInt());
                curNum --;
            }
            // 输出上一次集合
            curSet.forEach(System.out::println);
            // 清空
            curSet.clear();
        }
    }
}
