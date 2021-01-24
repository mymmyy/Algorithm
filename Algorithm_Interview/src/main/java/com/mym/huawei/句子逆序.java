package com.mym.huawei;

import java.util.Scanner;

/**
 * 将一个英文语句以单词为单位逆序排放。例如“I am a boy”，逆序排放后为“boy a am I”
 * 所有单词之间用一个空格隔开，语句中除了英文字母外，不再包含其他字符
 */
public class 句子逆序 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            String[] s1 = s.split(" ");
            StringBuilder builder = new StringBuilder();
            for (int i = s1.length - 1; i >= 0; i--) {
                builder.append(s1[i]).append(" ");
            }
            System.out.println(builder.toString().trim());
        }
    }
}
