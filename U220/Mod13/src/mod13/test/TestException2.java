package mod13.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class TestException2 {

    public static void main(String[] args) {
        try{
            System.out.println(1/0);            
        }finally{
            System.out.println("The END1.");
        }

        try {
            int i = 10, j = 100;
            System.out.println(j / i);

            String s = "1234";
            i = Integer.parseInt(s); //unchecked exception
            System.out.println("i = " + i);
            
            s = null;
            System.out.println("s.length = " + s.length());

            String date = "1989/8/2";
            Date d = DateFormat.getDateInstance().parse(date);  //checked exception. compile error
            System.out.println(d);
        } catch (ParseException|NumberFormatException ex) {  //錯誤情況 | 錯誤情況   JAVA7.0以上支援
            Logger.getLogger(TestException2.class.getName()).log(Level.SEVERE, "格式錯誤", ex);
        } catch (ArithmeticException ex) {
            System.out.println("除法分母不得為零" + ex );
        } catch (Exception ex){  //不包含error  
            Logger.getLogger(TestException2.class.getName()).log(Level.SEVERE, "發生非預期錯誤", ex);
            return;
        } finally{ //無論有沒有錯誤都要做的 ex.資料庫開關
            System.out.println("The End2.");  
        }

    }

}
