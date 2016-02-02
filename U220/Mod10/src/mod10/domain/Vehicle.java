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
public abstract class Vehicle {
    
    private double load;
    private final double maxload;

    
    public Vehicle(double maxload) {
        this.maxload = maxload;
    }



    /**
     * @return the load
     */
    public double getLoad() {
        return load;
    }

    /**
     * @param load the load to set
     */
    public void setLoad(double load) {
        this.load = load;
    }

    /**
     * @return the maxload
     */
    public double getMaxload() {
        return maxload;
    }
    
    public abstract double getCost(int year, int month);
    //提供一個空方法讓子類別override，強迫的。
    
    
    
}
