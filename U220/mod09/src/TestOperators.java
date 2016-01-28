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
        System.out.println("結果為：" + 2 + 3 / 5);
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
        //型別需可相容之型別
        System.out.println(k == 127);   //最後k的確為127  TRUE
        System.out.println(true == true); //是否相同嗎？ T
        System.out.println(true != true); //是否不同嗎？ F
        System.out.println(true != false);//是否不同嗎？ T
        //可以比較相不相同 不限制數字字元，但要相同型別的比較。

        System.out.println("以下為AND &：");
        System.out.println(true & true); //T

        System.out.println(true & false); //F　　
        System.out.println(false & true); //F
        System.out.println(false & false);//F

        System.out.println("以下為OR | ：");
        System.out.println(true | true);//T
        System.out.println(true | false);//T
        System.out.println(false | true);//T
        System.out.println(false | false);//F

        System.out.println("以下為XOR ^ ：");
        System.out.println(true ^ true);//F
        System.out.println(true ^ false);//T
        System.out.println(false ^ true);//T
        System.out.println(false ^ false);//F

        System.out.println("以下為NOT !：");
        System.out.println(!true); //f
        System.out.println(!false);//t

        System.out.println("以下為&&：");
        System.out.println(false && true);
        //t 第一個判斷false 就會省略後面判斷，直接丟出false

        System.out.println("以下為||");
        System.out.println(true || true); //第一個true符合就直接丟true出來
        
        //位元operators： ~ 求補數, &, |, ^
        byte o = 6, p = 5;   //6：00000110    5：00000101  
        System.out.println("位元運算~：" + Integer.toBinaryString(~o));  //Integer.toBinaryString(int i)  顯示二進位模式
        System.out.println("位元運算&：" + (o&p));//顯示為預設之十進位
        System.out.println("位元運算|：" + Integer.toBinaryString(o|p));
        System.out.println("位元運算^：" + Integer.toBinaryString(o^p));
        
        byte q = 15;
        System.out.println("q>>1 = " + (q>>1));  //除以2的1次方
        System.out.println("q<<1 = " + (q<<1));  //乘以2的1次方
        System.out.println("q>>2 = " + (q>>2));  //除以2的2次方
        System.out.println("q<<2 = " + (q<<2));  //乘以2的2次方
        
        System.out.println("q>>>1 = " + (q>>>1));  //除以2的1次方(恆正)
        System.out.println("q>>>2 = " + (q>>>2));  //除以2的2次方(恆正)
        System.out.println("-q>>>1 = " + (-q>>>1));  //除以2的1次方(恆正)
        System.out.println("-q>>>2 = " + (-q>>>2));  //除以2的2次方(恆正)
        
        System.out.println("-q>>1 = " + (q>>1));  //除以2的1次方
        System.out.println("-q<<1 = " + (q<<1));  //乘以2的1次方
        System.out.println("-q>>2 = " + (q>>2));  //除以2的2次方
        System.out.println("-q<<2 = " + (q<<2));  //乘以2的2次方
        
        
        //指派運算子
        
        byte n1 = 1, n2=2;
        //n1= n1*(n1+n2)+100;
        System.out.println("n2*=n1+n2/100 = " + (n2*=n1+n2/100));
        
        //三元運算子
        int grade = 60;
        System.out.println((grade>=60)?"Pass" :"Fail"); //如果符合條件則輸出"pass" 否則"fail"
        
        if(grade>=60){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }
        
        
        boolean test;
        float t = (test=false)?1:2.0F;
        //double t也可以 (因為等號右側型別為float，可提升型別至double)
        double s =(test = false)?'1':2.0F;
        //'1'：會輸出成字碼去顯示
        //不可使用"1"  因為不是字串型別
        
        
        
        System.out.println("t = " + t);
        System.out.println((test=false)?1:2.0);
        
                
        
        //優先序：算數(先乘除後加減) > 比較 > 邏輯
        char data;
        for (int i = 0; i < 26; i++) {
            data = (char) ('a' + i);
            System.out.print(data + " ");
        }
        //印出a~z

        //身分證字號起手
        String id = "A123456789";
        char c0 = id.charAt(0);
        //抓出身分證字號第一碼英文
        char c9 = id.charAt(9);
        System.out.println("c9 = " + c9);
        //抓出檢查碼
        
        
    }
}
