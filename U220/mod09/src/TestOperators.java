/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class TestOperators {

    public static void main(String[] args) {
        System.out.println(1 + 2);//3
        //最大型別int相加  1+2=3
        System.out.println(1 / 2);//0
        //運算元型別最大都是int 結果小於只會強迫轉型為int
        System.out.println(1 / 2D);//0.5
        //運算元型別最大是double  結果會完整表示
        System.out.println('1' + '2'); //char字碼49 + 50 = 99
        System.out.println("1" + 2); //單引號是字元，字串相加>>12

        byte a = 1, b = 1, c;
        //c = a + b;
        //兩個值(1,2)都是int型別，結果為3 型別為int，
        //無法被指派到較小型別byte。
        c = (byte) (a + b);
        //先相加完，再轉型。

        //假設有人活十萬歲，請問她活幾秒鐘？
        long age = 10_0000 * 365L * 60 * 60;
        System.out.println("age = " + age);
        //365L 須於電腦第一次計算時抓取最大型別，資料才會正確

        double avg = 1.0 / 2;
        System.out.println("avg = " + avg);

        double answer = 1 % 2.d;
        System.out.println("answer = " + answer);
        //1除以2  餘數為 1

        byte k = 1;
        //k++;//k=k+1  = (byte)(k+1) 一樣都是byte型態
        //++k;//k=k+1
        //System.out.println("k = " + k);

        System.out.println("k = " + k++);
        //print:1  k:2
        System.out.println("k = " + ++k);
        //k運算  print:3  k=3

        k = 127;  //(型態還是byte)
        System.out.println("k = " + ++k);
        //127+1 byte爆掉 >>>印出-128

        System.out.println("k = " + --k); //k=(byte)(k-1)
        //-128 -1 一樣爆掉>>>印出127

        System.out.println('A' < 'a'); //'A'字碼為65 'a'字碼為97 TRUE
        System.out.println(k == 127);   //最後k的確為127  TRUE
        System.out.println(true == true); //是否相同嗎？ T
        System.out.println(true != true); //是否不同嗎？ F
        //可以比較相不相同 不限制數字字元，但要相同型別的比較。

        char data;
        for (int i = 0; i < 26; i++) {
            data = (char) ('a' + i);
            System.out.print(data + " ");
        }
        //印出a~z

        String id = "A123456789";
        char c0 = id.charAt(0);
        //抓出身分證字號第一碼英文
        char c9 = id.charAt(9);
        System.out.println("c9 = " + c9);
        //抓出檢查碼
    }
}
