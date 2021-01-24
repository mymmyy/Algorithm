package com.mym.huawei;

import java.util.Scanner;
import java.util.TreeMap;

public class Six3Ten {
    public static void main(String[] args) {
        shuAdd();
    }

    /**
     * 数据表记录包含表索引和数值（int范围的整数），请对表索引相同的记录进行合并，
     * 即将相同索引的数值进行求和运算，输出按照key值升序进行输出
     */
    public static void shuAdd(){
        Scanner scanner = new Scanner(System.in);
        TreeMap<Integer, Integer> map = new TreeMap<>();
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            while (num-- > 0){
                int key = scanner.nextInt();
                int val = scanner.nextInt();
                map.compute(key, (k, v) -> (v == null ? val : v + val));
            }
            map.forEach((k , v) -> System.out.println(k + " " + v));
            map.clear();
        }
    }

    public static void six2ten(){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String next = scanner.next();
            if(!"".equals(next)){
                char[] chars = next.toCharArray();
                long result = 0;
                long curMulti = 0;
                for(int i = chars.length - 1; i > 1; i--){
                    if(chars[i] == 'A' || chars[i] == 'a') result += (10 *  Math.pow(16,curMulti));
                    else if(chars[i] == 'B' || chars[i] == 'b') result += (11 *  Math.pow(16,curMulti));
                    else if(chars[i] == 'C' || chars[i] == 'c') result += (12 *  Math.pow(16,curMulti));
                    else if(chars[i] == 'D' || chars[i] == 'd') result += (13 *  Math.pow(16,curMulti));
                    else if(chars[i] == 'E' || chars[i] == 'e') result += (14 *  Math.pow(16,curMulti));
                    else if(chars[i] == 'F' || chars[i] == 'f') result += (15 *  Math.pow(16,curMulti));
                    else if(chars[i] == '9') result += (9 *  Math.pow(16,curMulti));
                    else if(chars[i] == '8') result += (8 *  Math.pow(16,curMulti));
                    else if(chars[i] == '7') result += (7 *  Math.pow(16,curMulti));
                    else if(chars[i] == '6') result += (6 *  Math.pow(16,curMulti));
                    else if(chars[i] == '5') result += (5 *  Math.pow(16,curMulti));
                    else if(chars[i] == '4') result += (4 *  Math.pow(16,curMulti));
                    else if(chars[i] == '3') result += (3 *  Math.pow(16,curMulti));
                    else if(chars[i] == '2') result += (2 *  Math.pow(16,curMulti));
                    else if(chars[i] == '1') result += (1 *  Math.pow(16,curMulti));
                    else if(chars[i] == '0') result += (0 *  Math.pow(16,curMulti));
                    curMulti++;
                }
                System.out.println(result);
            }
        }
    }
}
