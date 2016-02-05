package mod12;
public class Enclosing2 {
    private int var;
    public class Inner {  //non-static nested class
        //private final static int i=1;
        public int getVar() {
            return var;
        }
    }
}

