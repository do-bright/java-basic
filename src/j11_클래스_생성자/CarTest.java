package j11_클래스_생성자;

public class CarTest{

    void print(){
        System.out.println("test 출력");
    }
    public static void main(String[] args){
        // print(); 바로 못씀 
        // 메소드를 쓰려면 인스턴스 생성이 되어있어야함 
        // ex. 사람을 만들고 set이름을 사용할 수 있음 
        // 사람도 없는데 이름을 만드는 것과 같음 

        // CarTest carTest = new CarTest();
        // carTest.print();

        Car_J11 c1 = new Car_J11("KIA","K5","White"); // 생성자 사용
        System.out.println(c1.company);
        System.out.println(c1.model);
        System.out.println(c1.color);
    }

}
