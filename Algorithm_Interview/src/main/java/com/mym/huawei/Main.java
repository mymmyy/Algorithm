package com.mym.huawei;

import java.util.*;

/**
 * 题目：给定一个正整数N代表火车数量，0<N<10，接下来输入火车入站的序列，一共N辆火车，每辆火车以数字1-9编号。要求以字典序排序输出火车出站的序列号。
 * 考点：栈
 */
public class Main {

    private static Stack<String> stack1 = new Stack<String>();
    private static Stack<String> stack2 = new Stack<String>();
    private static List<String> list = new ArrayList<String>();

    public static void ff(String str) {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            list.add(str.trim());
            return;
        }
        if (!stack2.isEmpty()) {
            String str1 = stack2.pop();
            ff(str + " " + str1);
            stack2.push(str1);
        }
        if (!stack1.isEmpty()) {
            String str2 = stack1.pop();
            stack2.push(str2);
            ff(str);
            stack2.pop();
            stack1.push(str2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            scanner.nextLine();
            String str = scanner.nextLine();
            String[] ss = str.split(" ");
            for (int i = ss.length - 1; i >= 0; i--)
                stack1.push(ss[i]);
            ff("");
            Collections.sort(list);
            for (String s : list)
                System.out.println(s);
        }

    }
}
