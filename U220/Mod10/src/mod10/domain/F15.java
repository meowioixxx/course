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
public class F15 extends Vehicle implements Flyer, Fighter{

    public F15(double maxload) {
        super(maxload);
    }


    @Override
    public double getCost(int year, int month) {
        return 355151651;
    }

    @Override
    public void takeOff() {
        System.out.println("F15要起飛...");
    }

    @Override
    public void fly() {
        System.out.println("F15正在飛...");
    }

    @Override
    public void land() {
        System.out.println("F15要降落...");
    }

    @Override
    public void fight() {
        System.out.println("F15正在戰鬥...");
    }
    
    
}
