package j14_추상;

public class Eagle extends Animal { 
    // 방법 (두개 중에 하나)
    // 1. Animal 꺼 받음 거기 추상메소드가 있음 -> 추상메소드가 있는걸 받았으니까
    // -> 이것도 abstract (추상 클래스 지정) => 우리의 목적이 아님 

    // 2. 오버라이딩 

    @Override
    public void move(){
        System.out.println("독수리가 하늘을 납니다.");
    }

    @Override
    public void eat(){
        // super.eat();
    }


    
}
