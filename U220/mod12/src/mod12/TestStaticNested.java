package mod12;
public class TestStaticNested {
    public static void main(String[] args) {
        EnclosingStaticNested.Nested.printData(1);
        
        EnclosingStaticNested.Nested nested = 
                new EnclosingStaticNested.Nested();
        
        System.out.println(nested.ns_var);
    }
    
}
