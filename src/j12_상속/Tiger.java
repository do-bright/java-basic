package j12_상속;

public class Tiger extends Animal {

    @Override
    public void move() {
        System.out.println("호랑이가 네 발로 뜁니다.");
    }
    public void hunting() {
        System.out.println("호랑이가 사냥을 합니다.");
    }

    // @Override // 재정의
    // public void move() { // 순서 2. 
    //     super.move(); // 주소.move -> super ? 부모의 주소 vs this ? 나 자신 
    //     // 부모의 move를 가져옴 
    //     // 순서 3.
    // }

    // public void moveTiger() {
    //     move(); // 순서 1. 
    // }

    // public void aaa() {
    //     System.out.println("test");
    // }

    // public void bbb() {
    //     aaa();
    // }
}
