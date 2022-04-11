package j12_상속;

public class Animal {

    public Animal() {
        System.out.println("부모 객체 생성");
    }

    public Animal(String str) {
        System.out.println(str);
    }
    
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
    
}
