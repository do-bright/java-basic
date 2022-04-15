package j16_static;

public class SingletonTest {
    public static void main(String[] args){
        // KIA factory1 = new KIA(); 
        // 에러 -> KIA 생성자를 private 로 했었음

        KIA factory1 = KIA.getInstance();
        // 이렇게 접근 
        // KIA 클래스를 하나만 만들어 놓고 쓰는 것
        // 같은 객체 안에서 같은 메소드 호출
        KIA factory2 = KIA.getInstance();
        KIA factory3 = KIA.getInstance();
        KIA factory4 = KIA.getInstance();

        //
        SingletonTest2 singletonTest2 = new SingletonTest2();
        singletonTest2.temp();
        //

        // 같은 serial Number = 같은 클래스다
        // System.out.println(factory1);
        // System.out.println(factory2);
        // System.out.println(factory3);
        // System.out.println(factory4);

        System.out.println(factory1.createCar("K5").toString());
        System.out.println(factory1.createCar("스포티지").toString());
        System.out.println(factory1.createCar("쏘렌토").toString());
        System.out.println(factory1.createCar("K9").toString());

        // factory1.createCar("K5");
        // factory1.createCar("스포티지");

        

    }
}
