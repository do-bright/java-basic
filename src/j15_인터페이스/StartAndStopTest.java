package j15_인터페이스;

public class StartAndStopTest {
    public static void main(String[] args){
        // StartAndStop startAndStop = new ProgramA();
        // StartAndStop startAndStop = new Factory();
        StartAndStop startAndStop = new Exam();

        // 업캐스팅
        // 상속과의 차이 ? 상속 = 1:1 대로만 상속 (부모 하나) 다중 상속 X
        // 구현(implement) = 다중 구현 가능 

        startAndStop.printInfo();
        startAndStop.start();
        startAndStop.stop();
    }
}
