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
        double f = 1D - 8E-1;  //IEEE 754
        //預設是double型
        //float需值後加F  double 需值後加D  不限大小寫

        System.out.println("e = " + e);
        System.out.println("f = " + f);

        System.out.println(010);
        //輸入是八進位，顯示會自動轉成int 十進位;
        //字串是參考行別(不能固定大小)

        //<文字類>
        System.out.println("文字類：");
        char c1 = 'a';
        char c6 = '\t'; //tab
        char c2 = '@';
        char c5 = '\u03a6';
        //加上反斜線會告訴系統此為控制碼
        //控制compiler為控制字元
        char c3 = '我';
        char c4 = 'φ';
        char c7 = '\\';  //需要反斜線需要給兩個(逃脫字元)
        //char 字元為單一字  unicode-table.com
        //  反斜線 "\" ：控制字元
        String c8 = "\\";

        System.out.println("c6 = " + c6);
        System.out.println("c2 = " + c2);
        System.out.println("c5 = " + c5);
        System.out.println("c3 = " + c3);
        System.out.println("c4 = " + c4);
        System.out.println("c7 = " + c7);
        System.out.println("c8 = " + c8);

        //邏輯類
        //java布林只有true 和 false
        //資料大小4byte
        boolean t1 = (1 > 2);//false
        boolean t2 = true;
        //c++  0為false 其他為真
        //java為強型別 不可以用數值 只能用邏輯判斷式或者T/F
        boolean t3 = Boolean.valueOf("true");
        //只能用Boolean.valueOf("字串")  將字串轉成布林值
        //C中的布林：BOOL
        System.out.println("t1 = " + t1);
        System.out.println("t2 = " + t2);
        System.out.println("t3 = " + t3);

        t2 = t1;
        System.out.println("t2 = " + t2);
    }
}
