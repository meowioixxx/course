/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod11.test;

/**
 *
 * @author Administrator
 */
public class TestFinalVars {

    private final int k;    //non-static final variable
    private final static int m;
    
    static{
        String data = System.getProperty("mydata");
        if(data != null && data.matches("\\d+")){
            m=Integer.parseInt(data);
        }else
            m=100;
    }
    
    
    
    
    
    public TestFinalVars() {
        this(100);
        //k = 100;
    }

    public TestFinalVars(int k) {
        this.k = k;
    }
    
    
    
    public static void main(final String[] args) {
        final int i;
        //未給初值:blank final var 
        //i = i++;  //不成立  i已被final
        System.out.println("i = " + (i=100));
        
        System.out.println("k:" + (new TestFinalVars(123).k));
        
        
    }
}
