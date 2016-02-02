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

public class Airplane extends Vehicle implements Flyer{

    public Airplane(double maxload) {
        super(maxload);
    }

    @Override
    public double getCost(int year, int month) {
        return 500000;
    }

    @Override
    public void takeOff() {
        System.out.println("飛機要起飛...");
    }

    @Override
    public void fly() {
        System.out.println("飛機正在飛...");
    }

    @Override
    public void land() {
        System.out.println("飛機要降落...");
    }
    


    
}
