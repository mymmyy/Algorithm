package com.mym.huawei;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 给定n个字符串，请对n个字符串按照字典序排列。
 * <p>
 * 输入第一行为一个正整数n(1≤n≤1000),下面n行为n个字符串(字符串长度≤100),字符串中只含有大小写字母。
 */
public class 字符串的连接最长路径查找 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int i = scanner.nextInt();
            ArrayList<String> list = new ArrayList<>();
            while(i-- > 0){
                String next = scanner.next();
                list.add(next);
            }
            Collections.sort(list);
            list.forEach(System.out::println);
            list.clear();
        }
    }
}
