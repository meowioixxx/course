package mod12;

public class Enclosing4 {
    private int var1 = 5;
    public Object makeTheLocal(int var) {
        final int finalVar = (int)(var*0.6);
        
        //Local Class
        class Local extends Object {
            public String toString() {
                return (
                        ":\n Enclosing4 var1:" + var1 +
                        //"\n local variable:" + var + //cannot compile
                        "\n final local variable: " + finalVar);
            }
            public void test(){
                System.out.println("Test");
            }
        }
        Local local = new Local();
        local.test();
        return local;
    }
}
