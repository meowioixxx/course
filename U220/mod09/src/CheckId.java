
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class CheckId {

    public static void main(String[] args) {
        //輸入ID
        System.out.print("請輸入ID：");
        Scanner scan = new Scanner(System.in); //參考型別Scanner  建立物件
        String id = scan.next();//輸入字串

        //String id = "A123456789";
        //將第一個英文字轉成對應數字
        id = id.toUpperCase();
        char firstChar = id.charAt(0);
        int firstNumber;

        if (firstChar >= 'A' && firstChar <= 'H') {
            firstNumber = firstChar - 'A' + 10;//A~H   10~17
        } else if (firstChar >= 'J' && firstChar <= 'N') {
            firstNumber = firstChar - 'J' + 18;//J~N   18~22
        } else if (firstChar >= 'P' && firstChar <= 'V') {
            firstNumber = firstChar - 'P' + 23;//P~V   23~29
        } else {  //I=34 W=32  X=30 Y=31 Z=33
            switch (firstChar) {
                case 'I':
                    firstNumber = 34;
                    break;
                case 'W':
                    firstNumber = 32;
                    break;
                case 'X':
                    firstNumber = 30;
                    break;
                case 'Y':
                    firstNumber = 31;
                    break;
                case 'Z':
                    firstNumber = 33;
                    break;//完成後直接跳到此判斷式結尾
                default:
                    System.out.println("錯誤！");
                    return;//直接結束程式。

            }
        }

        //
        int sum = (firstNumber / 10) + (firstNumber % 10) * 9;

        for (int i = 1; i <= 8; i++) {
            //for (int j = 8; j >= 1; j--) {
            sum = sum + (id.charAt(i) - '0') * (9 - i);
            //}
        }
        //sum = sum + (id.charAt(1) - '0') * 8;
        //sum = sum + (id.charAt(2) - '0') * 7;
        //sum = sum + (id.charAt(3) - '0') * 6;
        //sum = sum + (id.charAt(4) - '0') * 5;
        //sum = sum + (id.charAt(5) - '0') * 4;
        //sum = sum + (id.charAt(6) - '0') * 3;
        //sum = sum + (id.charAt(7) - '0') * 2;
        //sum = sum + (id.charAt(8) - '0') * 1;

        sum = sum + (id.charAt(9) - '0') * 1;
        System.out.println("sum = " + sum);
        System.out.println("此身分證字號有效性：" + (sum % 10 == 0));
    }
}
