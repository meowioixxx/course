/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod13.test;

/**
 *
 * @author Administrator
 */
public class TestError {
    
        static{
            String s = null;
            if(s != null){ //2.加上事前判斷解決 NullPointerException
                System.out.println(s.length()); //1.NullPointerException  >>>為RuntimeError，可事前判斷預防來解決問題。
            }
        }
   
    public static void main(String[] args) {
        //加入判斷式解決為StackOverflowError
        if(args != null && args.length >=0){
            main(null);  //遞迴造成之錯誤。為Error中之StackOverflowError
        }else
            System.out.println("The End.");
    }
    
}
