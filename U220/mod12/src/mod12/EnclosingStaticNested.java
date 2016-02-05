package mod12;

public class EnclosingStaticNested {
    private static int var;    
    public static class Nested { //Static Nested Class
        private static int var;
        public int ns_var;
        public static void printData(int var) {
            var++;            
            Nested.var++;
            EnclosingStaticNested.var++;             
        }
    }
}