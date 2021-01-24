package com.mym.huawei;

public class 字符串全排列 {

    public static void main(String[] args) {
        String waitList1 = "1234";
        Permutation(waitList1.toCharArray(), 0, waitList1.length() - 1);
    }

    public static void Permutation(char[] s, int from, int to) {
        if(to<=1)
            return;
        if(from == to){
            System.out.println(s);
        }
        else{
            a:for(int i=from;i<=to;i++){
                //排除重复：带重复字符的全排列就是每个字符分别与它后面非重复出现的字符交换
                for(int j=from;j<i;j++){
                    if(s[j] == s[i]){
                        continue a;
                    }
                }

                swap(s,i,from);
                Permutation(s,from+1,to);
                swap(s,from,i);
            }
        }
    }


    public static void swap(char[] s, int i, int j) {
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }
}
