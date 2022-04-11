package j12_상속;

public class AnimalTest {

    public static void main(String[] args) {
        Human h = new Human();
        Tiger t = new Tiger();

        h.move();
        // t.moveTiger();
        t.move();

        h.readBooks();
        t.hunting();

        Animal a = new Animal();
        a.move();

    }

}

// 오버라이딩 상속과 관련 부모를 통해 상속을 받은 메소드를 자식이 재 정의 
// 오버로딩 상속과 아예 상관 없음 똑같은 메소드 이름이지만 매개변수가 다른 거 
