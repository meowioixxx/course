package mod12;
public class Enclosing5 {
    private int var1 = 5;
    public Object makeTheLocal(int var) {
        final int finalVar = (int)(var*0.6);
        
        //Anonymous Class
        Object obj = new Object(){
            public String toString() {
                return (
                        ":\n Enclosing4 var1:" + var1 +
                        //"\n local variable:" + var + //cannot compile
                        "\n final local variable: " + finalVar);
            }
            public void test(){
                System.out.println("Test");
            }
        };
        //obj.test(); //cannot compile
        return obj;
    }
    
    public static void main(String[] args) {
        
        Enclosing5 outer = new Enclosing5();
        Object o = outer.makeTheLocal(46);
        System.out.println(o);
    }
    
}
