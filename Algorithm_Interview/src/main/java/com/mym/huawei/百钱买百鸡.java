package com.mym.huawei;

import java.util.Scanner;

/**
 * 公元前五世纪，我国古代数学家张丘建在《算经》一书中提出了“百鸡问题”：
 * 鸡翁一值钱五，鸡母一值钱三，鸡雏三值钱一。
 * 百钱买百鸡，问鸡翁、鸡母、鸡雏各几何？
 */
public class 百钱买百鸡 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            scanner.next();
            buy();
        }


    }

    public static void buy(){
        for(int i = 0; i <= 20; i++){
            for(int j = 0;j <= 33; j++){
                int chuNum = (100 - i - j);
                if((i * 5 + j * 3 + chuNum / 3 == 100)  && chuNum % 3 == 0){
                    System.out.println(i + " " + j + " " + chuNum);
                }
            }
        }
    }
}
