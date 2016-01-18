
import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrator
 */
public class TestSwitchCase {

    public static void main(String[] args) {
        int weekday = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
        System.out.println("weekday = " + weekday);
        final int Tue = 3; //加final變成常數(不可再更動) 沒有則為變數

        switch (weekday) {//較if快速，但較不易讀
            //(byte short char int 或者列舉型別<JDK5.0>、字串型別<JDK7.0>)
            case Calendar.MONDAY: //final int值(常數值)
            case Tue:
            case Calendar.THURSDAY://值   5
                System.out.println("整天");
                break;
            case 4://Calendar.WEDNESDAY
            case 6://星期五 ,6
                System.out.println("半天");
                break;
            case Calendar.SATURDAY:
            case Calendar.SUNDAY:
                System.out.println("放假");
                break;
            default:
                System.out.println("錯誤！");
        }

    }
}
