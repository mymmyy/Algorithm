package com.mym.huawei;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class 日期到天数的转换 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int year = scanner.nextInt();
            int month = scanner.nextInt();
            if(month < 1 || month > 12){
                System.out.println(-1);
            }
            int day = scanner.nextInt();
            if(day < 1 || day > 31){
                System.out.println(-1);
            }

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Calendar instance = Calendar.getInstance();
            instance.set(year, month, day);

        }
    }
}
