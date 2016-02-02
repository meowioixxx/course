/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod10.domain;

/**
 *
 * @author Administrator
 */
public class F16 extends Vehicle implements FlyerII {

    public F16(double maxload) {
        super(maxload);
    }

    @Override
    public void fly(int speed) {        
         System.out.println("F16正在飛行，速度是音速" + speed);
    }

    @Override
    public double getCost(int year, int month) {
        return 846546654;
    }

    @Override
    public void takeOff() {
        System.out.println("F16要起飛...");
    }

    @Override
    public void fly() {
        System.out.println("F16正在飛...");
    }

    @Override
    public void land() {
        System.out.println("F16要降落...");
    }

    @Override
    public void fight() {
        System.out.println("F16正在戰鬥...");
    }

    
}
