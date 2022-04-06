package j10_메소드;

import java.util.Scanner;

public class MethodEx4{

    /**
     * 메소드 (함수인데 클래스 안에 정의하기 때문에  메소드라고  지칭)
     * 1. 매개변수 X 리턴자료형 X
        2. 매개변수 O 리턴자료형 X
        3. 매개변수 X 리턴자료형 O
        4. 매개변수 O 리턴자료형 O
     */

    // 1
    static void add() {

    }

    // 2
    static int add(int x, int y){
        return 0;
    }

    // 3
    static int add2(){
        return 0;
    }

    // 4 
    static int add2(int x, int y){
        return x+y;
    }

    /*
     * 메소드 오버로딩
     * 매개변수의 형태가 다르면 동일한 이름 메소드를 정의할 수 있다
     */

    static void test(){

    }

    static void test(int num){

    }

    static void test(String str){

    }

    static void test(int num, int num2){

    }


    /////////

    /*
     * return 자료형이 void 일 때, 
     * 메소드를 강제로 탈출 할 수 있는 방법
     * 반환 값이 없는 return을 사용
     */

    static void oddAndEven(int num) {
        if (num % 2 == 0){
            System.out.println("메소드 탈출");;
            return; // 함수 탈출 like a break 
        }
        System.out.println("메소드 탈출하지 않고 끝까지 실행됨");
    }

    public static void main(String[] args){
        // oddAndEven(9);
        oddAndEven(10);

     }
    
}
