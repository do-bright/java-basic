package j11_클래스_생성자;

// 클래스 (틀) 정의 -> 클래스로 여러 인스턴스를 만들 수 있음
public class Car_J11 {

    // 생성자 1. 클래스명과 이름 동일 2. return 자료형 없음 
     // 테스트에서 Car_J11 c1 = new Car_J11(); 정의

    String company;
    String model;
    String color;

    Car_J11(){  
        // 기본 생성자 (no argument constructor)
        System.out.println("생성자 호출 ");;

    }

    Car_J11(int num, int num2){ 
        // 사용자 지정 생성자 (argument constructor)
        System.out.println(num + num2);
    }

    Car_J11(String company, String model, String color) { 
        // 전체 생성자 (All argument constructor)
        this.company=company;
        this.model=model;
        this.color=color;
        System.out.println(this);
    }

    void test(){

    }

  

}