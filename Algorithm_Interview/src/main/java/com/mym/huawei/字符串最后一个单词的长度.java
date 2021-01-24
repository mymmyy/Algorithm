package com.mym.huawei;

import java.util.Scanner;

public class 字符串最后一个单词的长度 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.nextLine().trim();
            int i = s.lastIndexOf(" ");
            if(i >= 0){
                System.out.println(s.substring(i + 1, s.length()).length());
            } else{
                System.out.println(s.length());
            }

        }
    }
}
