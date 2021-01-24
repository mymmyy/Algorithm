package com.mym.huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 编写一个函数，传入一个int型数组，返回该数组能否分成两组，
 * 使得两组中各元素加起来的和相等，并且，
 * 所有5的倍数必须在其中一个组中，
 * 所有3的倍数在另一个组中（不包括5的倍数），
 * 能满足以上条件，返回true；不满足时返回false。
 */
// TODO
public class 数组分组 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int m = scanner.nextInt();
            int[] arr = new int[m];
            int sum = 0;
            int bei3sum = 0;
            int bei5sum = 0;
            int othersum = 0;
            List<Integer> bei3List = new ArrayList<>();
            List<Integer> bei5List = new ArrayList<>();
            List<Integer> otherList = new ArrayList<>();
            while(m-- > 0){
                int cur = scanner.nextInt();
                arr[m] = scanner.nextInt();
                if(Math.abs(cur / 3) > 0 && cur % 3 == 0){
                    bei3List.add(cur);
                    bei3sum += cur;
                } else if (Math.abs(cur / 5) > 0 && cur % 5 == 0){
                    bei5List.add(cur);
                    bei5sum += cur;
                } else {
                    otherList.add(cur);
                }
                sum += arr[m];
            }
            if(sum % 2 != 0){
                System.out.println(false);
            }
            if(bei3sum > 0 && bei5sum > 0 && bei3sum != bei5sum){
                System.out.println(false);
            }


            System.out.println(isAdd(arr, sum));
        }
    }

    private static boolean isAdd(int[] arr, int sum) {
        return false;
    }
}
