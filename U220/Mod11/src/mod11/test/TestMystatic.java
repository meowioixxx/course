/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod11.test;

import mod11.domain.MyStatic;

/**
 *
 * @author Administrator
 */
public class TestMystatic {

    public static void main(String[] args) {
        
        System.out.println(MyStatic.i);

        //System.out.println(MyStatic.j);  //未建立物件，無法抓取到j
        MyStatic.i = 123;

        MyStatic o1 = new MyStatic();
        System.out.println("o1.i = " + o1.i);
        System.out.println("o1.j = " + o1.j);

        o1.i = 456;
        o1.j = 456;
        
        MyStatic o2 = new MyStatic();
        System.out.println("o2.i = " + o2.i);
        System.out.println("o2.j = " + o2.j);
        
        

    }
}
