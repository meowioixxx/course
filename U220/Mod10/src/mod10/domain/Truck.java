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
public class Truck extends Vehicle {

    public Truck(double maxload) {
        super(maxload);
    }

    @Override
    public double getCost(int year, int month) {
        return 10000;
    }



}
