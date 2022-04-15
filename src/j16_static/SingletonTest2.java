package j16_static;

public class SingletonTest2 {
    public void temp(){
        KIA factory1 = KIA.getInstance();

        // factory.createCar("K8");
        System.out.println(factory1.createCar("스포티지").toString());

    }
}
