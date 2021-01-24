package com.mym.huawei;

import java.util.*;

public class 集五福 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String input = scanner.next();
            if ("".equals(input)) {
                System.out.println(0);
            }


            // 初始化
            int curIndex = 1;
            Map<Integer, Integer> indexNum = new HashMap<>();
            indexNum.put(1, 0);
            indexNum.put(2, 0);
            indexNum.put(3, 0);
            indexNum.put(4, 0);
            indexNum.put(5, 0);

            char[] chars = input.toCharArray();
            int toGroupNum = 0;
            for (char aChar : chars) {
                if(aChar == '1'){
                    indexNum.compute(curIndex, (k, v) -> v == null ? 1 : v + 1);
                    curIndex ++;
                } else if(aChar == ','){
                    curIndex = 1;
                    toGroupNum ++;
                } else {
                    curIndex ++;
                }
                if(toGroupNum >= 10){
                    break;
                }
            }

            // 找出最小的
            Collection<Integer> values = indexNum.values();
            Iterator<Integer> iterator = values.iterator();
            int min = -1;
            while (iterator.hasNext()){
                Integer next = iterator.next();
                if(min == -1 || min > next){
                    min = next;
                }
            }
            min = min == -1 ? 0 : min;
            System.out.println(min);
        }
    }

}
