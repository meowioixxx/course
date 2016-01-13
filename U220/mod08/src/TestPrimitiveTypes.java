/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class TestPrimitiveTypes {

    public static void main(String[] args) {
        byte a = 10;    //10進位
        short b = 017;  //0開頭是八進位
        int c = 0b010;  //2進位   0b開頭   java 7 .0以上有支援
        long d = 0xcafe; //16進位 0x開頭
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);

    }
}
