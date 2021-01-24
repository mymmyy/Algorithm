package com.mym.huawei;

import java.util.Scanner;

/**
 * •连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；
 * •长度不是8整数倍的字符串请在后面补数字0，空字符串不处理
 */
public class OutputArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String next = scanner.next();
            selfPrint(next);
        }
    }

    private static void selfPrint(String next) {
        if(next.length() < 8){
            next += "00000000";
            System.out.println(next.substring(0, 8));
        }
        else if(next.length() == 8){
            System.out.println(next);
        }
        else if(next.length() > 8){
            while(next.length() > 0){
                System.out.println(next.substring(0, 8));
                next = next.substring(8, next.length());
                while(next.length() > 0 && next.length() < 8){
                    next += "0";
                }
            }
        }

    }
}
