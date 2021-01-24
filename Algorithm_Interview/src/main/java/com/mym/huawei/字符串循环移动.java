package com.mym.huawei;

/**
 *  (X’Y’)’=YX
 *
 *  如：abcdef
 *
 *  X=ab X’=ba
 *
 *  Y=cdef Y’=fedc
 *
 *  (X’Y’)’=(bafedc)’=cdefab
 *
 *  时间复杂度O(N)，空间复杂度O(1)
 */
public class 字符串循环移动 {

    /**反转。把字符数组从from位置到to位置的数反转*/
    static void revertStr(char[] str, int from, int to){
        if(to - from < 1){
            return;
        }
        for(int i = from; i < (to + from + 1)/2;i++){
            swapChar(str,i,to -(i - from));
        }
    }

    static void swapChar(char[] s, int i, int j) {
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }

    /**字符数组str中moveStrHead位置到moveStrEnd位置的字符向右循环移动moveLength位*/
    static void circleLeftMove(char[] str, int moveStrHead, int moveStrEnd, int moveLength){
        revertStr(str, moveStrHead, moveStrEnd);
        revertStr(str, moveStrEnd+1, moveStrEnd + moveLength);
        revertStr(str, moveStrHead, moveStrEnd + moveLength);
    }

    public static void main(String[] args) {
        String test = "123456789";
        char[] charArray = test.toCharArray();
        circleLeftMove(charArray, 0, 2, 2);
        System.out.println(charArray);
    }
}
