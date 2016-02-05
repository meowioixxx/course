/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod12;

/**
 *
 * @author Administrator
 */
public class TestAnonymousClass {

    public static void main(String[] args) {
        Object o = new Object() {
            @Override
            public String toString() {
                test();
                return "Hello Object!!!!!";
            }

            public void test() {
                System.out.println("Test");
            }
        };//在物件小括號後面，加大括號，為一新匿名類別。
        Comparable c = new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };

        System.out.println(o);
    }
}
