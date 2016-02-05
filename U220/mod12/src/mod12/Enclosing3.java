package mod12;
public class Enclosing3 {
    private int var;
    
    public class Inner {
        private int var ;
        
        public void printData(int var) {
            var++;            //local variable      
            this.var++;       //member of inner class
            Enclosing3.this.var++;  //member of Enclosing3
        }
    }
}
