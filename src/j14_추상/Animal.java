package j14_추상;

public abstract class Animal { // 2. 클레스 내부에 추상클래스가 있으니까 추상클래스로 만들어줌 
    // 같은 동물을 묶어 주기 위함 
    // move 는 사실 어차피 
    // 사람이면 사람에 맞게 호랑이면 호랑이에 맞게 오버로딩해서 다시 씀 
    // ex. 사람이 움직입니다 / 호랑이가 움직입니다
    // -> 사실상 묶기만 한 것임

    public abstract void move(); // 1.
    // public void move(){
    //     System.out.println("동물이 움직입니다.");
    // }

    public abstract void eat();
    
}
