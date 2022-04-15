package j15_인터페이스;

public interface StartAndStop {
    public default void printInfo(){

        
    } // 인터페이스는 기본 default가 추상메소드
    public void start();
    public void stop();
}
