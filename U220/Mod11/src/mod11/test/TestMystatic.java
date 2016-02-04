package mod11.test;

import mod11.domain.MyStatic;

/**
 *
 * @author Administrator
 */
public class TestMystatic {
    int k;

    public static void main(String[] args) {
        
        //System.out.println(k);  錯誤
        //static 方法中，不可以直接存取non-static成員!!
        //解決：System.out.println(new TestMyStatic().i);
        
        System.out.println(MyStatic.getI());

        //System.out.println(MyStatic.j);  //未建立物件，無法抓取到j
        MyStatic.setI(123);

        MyStatic o1 = new MyStatic();
        System.out.println("o1.i = " + o1.getI());
        System.out.println("o1.j = " + o1.getJ());

        o1.setI(456);
        o1.setJ(456);
        
        MyStatic o2 = new MyStatic();
        System.out.println("o2.i = " + o2.getI());
        System.out.println("o2.j = " + o2.getJ());
        
        

    }
}
