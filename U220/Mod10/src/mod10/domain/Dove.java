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
public class Dove implements Flyer{    

    @Override
    public void takeOff() {
        System.out.println("鴿子要起飛了");
    }

    @Override
    public void fly() {
        System.out.println("鴿子正在飛");
    }

    @Override
    public void land() {
        System.out.println("鴿子要降落了");
    }
    
}
