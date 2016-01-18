
import java.util.Calendar;
import java.util.Locale;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrator
 */
public class TestIf {

    public static void main(String[] args) {
        int weekday = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
        //抓取現在時刻(格林威治時間)sunday=1 monday=2 tusday=3...

        System.out.println("weekday = " + weekday);

        //
        if ((weekday == Calendar.MONDAY) || (weekday == Calendar.TUESDAY) || (weekday == Calendar.THURSDAY)) {
            System.out.println("整天");
            System.out.println("請帶便當");
        } else if (weekday == Calendar.WEDNESDAY || weekday == Calendar.FRIDAY) {
            System.out.println("半天");
        } else if (weekday == Calendar.SATURDAY || weekday == Calendar.SUNDAY) {
            System.out.println("放假");
        } else {
            System.out.println("錯誤！");
        }
    }

}
