package j16_static;

import java.time.LocalDate;

public class KIA {
    private static KIA instance;
    private String companyName;
    private int serialNumber; // 자동차 만들 때 생성, 객체 내에서만 증가

    // 1. 생성자가 private = 클래스 내부에서만 접근가능 !
    // 2. Test에서 호출 안됌 
    private KIA(){
        companyName="KIA";
        serialNumber = LocalDate.now().getYear()*10000; // 현재 년도로 지정 ( 객체 생성할 때만 )
    }

    // 3. 쓰고 싶은데 못 쓰니까 아래 getInstance()를 통해 KIA return 
    // 4. 그래서 Instance 가 뭐야 ? -> 위에 선언 보니까 Static 공유 변수
    public static KIA getInstance(){
        if(instance == null){ // 5. instance가 없으면 생성 ( = 젤 처음 때만 생성한다 )
            instance = new KIA();
        }
        return instance;
    }

    // 6. 딱 한번만 생성해서 쓸 때 이렇게 사용 (SingleTon) 

    public Car createCar(String model){
        return new Car(++serialNumber,companyName,model); 
    }

}
