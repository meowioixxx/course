package mod12;
public class Enclosing1 {//外圍類別
    private int var;
    
    //inner class
    private class Inner { //巢狀類別
        public int getVar() {
            return var;
        }
    }
    
    public void testMyInner() {  
        Inner i = new Inner();
        i.getVar();
    }
}
