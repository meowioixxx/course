/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class TestWhile {
    public static void main(String[] args) {
//        for(int i = 1;i<10;i++){
//            System.out.println("i = " + i);
//        }
        int i = 1,j = 1;
        while(i < 10){
            System.out.println("i = " + i++); //印完再+1
        }
        
        do{
            System.out.println("j = " + j++);
        }while(j<=10);
    }
}
