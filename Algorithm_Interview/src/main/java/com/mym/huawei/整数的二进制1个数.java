package com.mym.huawei;


import java.util.Scanner;

/**
 * 譬如：输入5 ，5的二进制为101，输出2
 */

public class 整数的二进制1个数 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int m = scanner.nextInt();
            System.out.println(findNumberOf1(m));
        }
    }

    public static int findNumberOf1(int num) {
        return Integer.toBinaryString(num).replaceAll("0", "").length();
    }
}
