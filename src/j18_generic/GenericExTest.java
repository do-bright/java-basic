package j18_generic;

public class GenericExTest{

    public static void main(String[] args) {
        GenericEx<String> ex = new GenericEx<String>(); // T를 String 으로 잡음
        // 변수 data 가 String 으로 됌  
        ex.setData("안녕");
        // ex.setData(1234) 숫자 X
        System.out.println(ex);

        GenericEx<Integer> ex2 = new GenericExTest<Integer>();
        //GenericEx<int> ex2 = new GenericExTest<int>(); 
        // > 에러 ; <> 에는 객체타입이 들가야함

        ex2.setData(1000);
        System.out.println(ex2);
    }

    
}
