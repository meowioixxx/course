package mod13.test;

import java.text.DateFormat;

/**
 *
 * @author Administrator
 */
public class TestException0 {
    public static void main(String[] args) {
        int i = 0, j =100;
        System.out.println(j/i);
        
        String s = "abcd";
        i = Integer.parseInt(s); //unchecked exception
        
        String date = "1989/8/2";
//        Date d = DateFormat.getDateInstance().parse(date);  //checked exception. compile error
        System.out.println(d);
        
    }
            
}
