package mod11.domain;

/**
 *
 * @author Administrator
 */


public class MyStatic {
    private static int i; //static attribute  class attribute

    //此為non-static initializer的建構式
    {
        
    }
    
    static{          //static initializer的建構式 屬性之初始化
        String data = System.getProperty("mydata");
        if(data !=null && data.matches("\\d+")){      //   \\d+  0~9  內容第一個字到最後一個字皆符合為數字
            i = Integer.parseInt(data);
        }
    }
    
    
    
    
    
    /**
     * @return the i
     */
    public static int getI() {        
        return i;
    }

    /**
     * @param i the i to set
     */
    public static void setI(int i) {
        MyStatic.i = i;   //只有static屬性 可以這樣用        
    }
    
    private int j; //non-static attribute  object/instance  attribute

    public MyStatic() {
//        this.i = i;  //指派assign  已經跟著類別建立時一起建立了
//        this.j = j; //初始化
        
    }
    
    
    
    
    /**
     * @return the j
     */
    public int getJ() {
        return j;
    }

    /**
     * @param j the j to set
     */
    public void setJ(int j) {
        this.j = j;
    }
    
    
    
}
