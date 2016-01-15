/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class TestPromotionCasting {

    public static void main(String[] args) {
        byte a, b;
        // = 左右兩側型別相同、值範圍正確：指派成功。
        a = 12;
        b = a;

        short c;
        /* 此處兩側型別不同，但皆為基本型別
           byte較小，short較大，
           值範圍正確，此為promotion：指派成功 */
        c = b;
        System.out.println("c = " + c); //12
        /* 指派層級 低>高
         * byte > short > int > long > float > double
                  char  > int
         */
        char d = '0';
        int k;
        k = d;
        System.out.println("k = " + k); //ASCII
        //此會顯示0 的字碼為97
        //把字元指派給整數型別，印出就是轉成unicode碼。>>轉碼YA
        //byte = 8bits 不夠放unicode碼
        int zero = d;//promotion
        System.out.println("zero = " + zero); //48
        long age = 100;//promotion

        //casting
        char one = (char) (k + 1);
        //由於原k+1型態為int，為了強迫轉回char，後加(char)。
        System.out.println("one = " + one);

        int m = 100000;
        if (m >= -32768 & m <= 32767) {
            //short範圍
            short h = (short) m;
            //強迫轉型
            System.out.println("h = " + h);
            //在範圍內就印出
        } else {
            System.out.println("超過值域限制範圍");
            //不在範圍內
        }
    }
}
