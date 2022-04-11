package j12_상속_다형성;

import j12_상속.Animal;
import j12_상속.Human;
import j12_상속.Tiger;

public class AnimalTest {

    public static void main(String[] args) {
        Human human = new Human();
        Animal animal = human;

        animal.move();
        // animal.readBooks(); 안됨 
        Human human2 = (Human)animal; // 업캐스팅
        human2.readBooks();

        //////////////

        Animal[] animals = new Animal[3];
        // 동물 생성 xx -> 동물 담는 공간 생성 

        animals[0] = new Human();
        animals[1] = new Tiger();
        animals[2] = new Tiger();
        animals[3] = new Animal();

        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
            animals[i].move();
            // ((Human) animals[i]).readBooks(); // 다운캐스팅 
            // // 에러 뜸 -> 각각의 객체에 맞게끔 다운 캐스팅 해야 함 

            if(animals[i] instanceof Human) // Human으로 생성된 객체인지 확인 
            {
                ((Human) animals[i]).readBooks();
                // Human h = (Human)animals[i];
                // h.readBooks();
            } else if (animals[i] instanceof Tiger) { // Tiger 으로 생성된 객체인지 확인 
                ((Tiger)animals[i]).hunting();
            } else {
                System.out.println("다운캐스팅 할 수 없습니다.");
            }
            
        }
    }
    
}

