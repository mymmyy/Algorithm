package com.mym.huawei;

import java.util.Scanner;

public class Warter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            if(n <= 0){
                System.exit(1);
            }
            drinkWarderNum(n);
        }

//        drinkWarderNum(59);
    }

    public static void drinkWarderNum(int nEmpty){
        if(nEmpty == 1){
            System.out.println(0);
        }
        int drinkNum = 0;
        int curEmpty = nEmpty;
        while(curEmpty > 1){
            int curDrinkNum = curEmpty / 3;
            drinkNum += curDrinkNum;
            curEmpty = curEmpty - (curDrinkNum * 3) + curDrinkNum;

            if(curEmpty == 2){
                drinkNum ++;
                curEmpty = 0;
            }
        }
        System.out.println(drinkNum);
    }
}
