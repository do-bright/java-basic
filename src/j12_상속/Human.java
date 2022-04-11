package j12_상속;

/**
 * 오버라이딩(재정의)
 *  
 * 부모클래스 또는 인터페이스로 부터 상속 또는 구현을 하게된 메소드를 재정의하여 사용하는 기법
 */
public class Human extends Animal {

    public Human() {
        // super() 클래스를 우선 생성 (부모 생성을 먼저) 한 후 다음 코드 실행 가능 !! 
        //super(); 생략되어있음 -> 테스트에서  Human h = new Human(); 실행시 부모 코드도 같이 출력됨 
        System.out.println("자식 객체 생성");
    }

    @Override  // 부모클래스로 구현된 메소드를 다시 정의한다 
    public void move() {
        // System.out.println("동물이 움직입니다."); 대신 아래 코드로 재정의
        System.out.println("사람이 두 발로 걷습니다.");
    }
    public void readBooks(){
        System.out.println("사람이 책을 읽습니다.");
    }
    
}
