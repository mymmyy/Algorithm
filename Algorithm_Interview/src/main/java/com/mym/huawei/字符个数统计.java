package com.mym.huawei;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 编写一个函数，计算字符串中含有的不同字符的个数。
 * 字符在ACSII码范围内(0~127)，换行表示结束符，不算在字符里。不在范围内的不作统计。
 */
public class 字符个数统计 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> stSet = new HashSet<>();
        while (scanner.hasNext()) {
            String next = scanner.next();
            for (char c : next.toCharArray()) {
                stSet.add(c + "");
            }
            System.out.println(stSet.size());
            stSet.clear();
        }

    }
}
