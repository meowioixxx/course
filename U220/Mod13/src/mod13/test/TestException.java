/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod13.test;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class TestException {

    public static void main(String[] args) throws IOException {
        int i = 0, j = 100;
        /**
         * [unchecked exception] RuntimeError>ArithmeticException 分母不得為零 Java
         * returned: 1 此為JVM內回傳運行不正確的值為非0 解決方法：加上判斷式>>事前防範。 事後處理>>印出錯誤訊息(本範例)
         */
        try {
            System.out.println(j / i);
        } catch (ArithmeticException ex) {
            System.out.println("發生嚴重錯誤：" + ex);
        }

        /**
         * [unchecked exception] RuntimeException > IllegalArgumentException
         * >NumberFormatException 解決：事前判斷/事後印出錯誤
         */
        String s = "abcd";
        try {
            i = Integer.parseInt(s);
            System.out.println("i = " + i);
        } catch (NumberFormatException ex) {
            System.err.println("發生嚴重錯誤：" + ex); //System.err.*  錯誤訊息標示(紅色)
        }
        System.out.println("i:" + i); 

        //錯誤判斷
        String date = "abcd/5/12";
        DateFormat df = DateFormat.getDateInstance();  //格式：yyyy/mm/dd  getDateTimeInstance()日期與時間

        //--------例子A--------//
        Date d;
        try {//[Checked Exception 應檢核例外]2.使用旁邊燈泡加入 try...catch 包住statment，但需要整理程式 ex.需移動System.out.println(d);
            d = df.parse(date); //[Checked Exception 應檢核例外1.]會提醒必須拋出錯誤處理，因為日期字串沒有判斷是否正確格式。(時區無判斷)
            System.out.println(d);     //但程式並無錯誤
        } catch (ParseException ex) {
//            Logger.getLogger(TestException.class.getName()).addHandler(new FileHandler(""));
//            //存入檔案
            Logger.getLogger(TestException.class.getName()).log(Level.SEVERE, "生日日期格式錯誤", ex);               
            //此行為自動修正產生，與以下兩行有相同功能
//            System.out.println("發生嚴重錯誤：" + ex);
//            ex.printStackTrace(System.out);  //詳細錯誤訊息，預設為  紅色(不放參數)，黑色(System.out)
            
        }

        //--------例子B--------//
        try {
            Date D = df.parse(date); //D為block variable
            System.out.println(D);
        } catch (ParseException ex) {
        }

    }
}
