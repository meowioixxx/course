package mod12;
public class TestAnonymous {
    
    public static void main(String[] args) {

      int i = 200;
        final int  j = i;
        
        Object o = new Object(){ //Anonymous Class
            public String toString() {                             
                return "Hello" + j;
            }
            public void test(){
                System.out.println("test");
            }
        };     

        
        Object o2 = new java.lang.Comparable() { //Anonymous Class
            public int compareTo(Object o) {
                   return 0;
            }
        };
        
        
    }    
}
