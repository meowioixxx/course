package mod12;
public class TestEnclosing4 {
    public static void main(String[] args) {
        Enclosing4 outer = new Enclosing4();
        Object obj = outer.makeTheLocal(82);        
        System.out.println(obj);
        //obj.test();   //Uncomment this line 

    }    
}
