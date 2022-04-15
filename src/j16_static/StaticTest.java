package j16_static;

public class StaticTest {
    public static String name;

    public static void test(){
        System.out.println("test");
    }

    public static void main(String[] args){
        // StaticEx.print();   
        // test();
        StaticEx.name="도해선";
        StaticEx2.print();
    } // static ; 생성하지 않았는데 메소드 사용 가능
    
}
