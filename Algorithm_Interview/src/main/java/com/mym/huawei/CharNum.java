package com.mym.huawei;

import java.util.Scanner;

public class CharNum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String next = scanner.next();
            if(!"".equals(next)){
                char[] chars = next.toLowerCase().toCharArray();
                char cp = scanner.next().toLowerCase().charAt(0);
                int cpNum = 0;
                for(int i = 0;i < chars.length; i++){
                    if(chars[i] == cp){
                        cpNum++;
                    }
                }
                System.out.println(cpNum);
            }

        }
    }
}
