package mod12;
public class TestEnclosing2 {
     public static void main(String[] args) {
        
        Enclosing2 outer = new Enclosing2();//先建立外部類別
        Enclosing2.Inner inner = 
                outer.new Inner();  //非靜態巢狀類別 必須先建立外圍類別，透過外圍類別建好的物件新建內部類別
        System.out.println(inner.getVar());
    }
    
}
