/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod10.test;

import mod10.domain.*;

/**
 *
 * @author Administrator
 */
public class TestVehicles {

    public static void main(String[] args) {
//        Truck t1 = new Truck(1000);
//        RiverBarge r1 = new RiverBarge(2000);
        Vehicle[] vehicles = new Vehicle[10];
        //使用抽象類別作一陣列限制數量0~10

        vehicles[0] = new Truck(1000);
        vehicles[1] = new RiverBarge(2000);
        vehicles[2] = new F15(500000);
        vehicles[3] = new F16(600000);
        double sum = 0;
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] != null) {
                sum += vehicles[i].getCost(2015, 12);
                if (vehicles[i] instanceof Flyer) {
                    ((Flyer) vehicles[i]).takeOff();
                    ((Flyer) vehicles[i]).fly();
                    if (vehicles[i] instanceof FlyerII) {
                        ((FlyerII)vehicles[i]).fight();
                    }
                    ((Flyer) vehicles[i]).land();
                }
            }
        }
        System.out.println("sum = " + sum);
    }
}
