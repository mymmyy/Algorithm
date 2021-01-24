package com.mym.huawei;

import java.util.Scanner;

public class 二进制连续1个数 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            long m = scanner.nextLong();
            String[] split = Long.toBinaryString(m).split("0");
            long maxLength = 0;
            for (String s : split) {
                if(s.length() > maxLength) maxLength = s.length();
            }
            System.out.println(maxLength);
        }
    }

}
