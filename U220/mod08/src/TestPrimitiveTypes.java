/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *ch.8  資料變數練習
 *
 * @author 我是吳綿綿
 */
public class TestPrimitiveTypes {

    public static void main(String[] args) {
        //變數名稱不可以與保留字重複
        byte a = 10;    //10進位   範圍：-128～127
        short _b = 017;  //0開頭是八進位
        int $c = 0b010;  //2進位   0b開頭   java 7 .0以上有支援
        long d = 0xcafe; //16進位 0x開頭

        /*byte 記憶體內的資料位置
                * _ _ _ _ _ _ _ _  共八個空格
                *例題. byte型態   -1(10進位) 表示方式
                *  0  -   1  >>>       00000000
                *                         - 00000001
                *                           11111111  >>>  -1 在二進位的表示方式    */
        System.out.println("a = " + a);
        System.out.println("_b = " + _b);
        System.out.println("$c = " + $c);
        System.out.println("d = " + d);

        //數值的三位一撇(金錢那種)，可以用底線代替
        int big = 1_000_00_00;
        long veryBig = 1234567891218542545L;
        //預設為int
        //長整數有如此需求，需要後加標示字母L(l)

        float e = 1.0f - 0.8f;  //IEEE 754
        //only 10進位
        //8E - 1  ==0.8
        //容易炸記憶體位置，所以........
        double f = 1.05 - 0.9;  //IEEE 754
        //預設是double型 float需值後加f
        System.out.println("e = " + e);
        System.out.println("f = " + f);
    }
}
