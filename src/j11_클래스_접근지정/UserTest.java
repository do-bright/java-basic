package j11_클래스_접근지정;

// 클래스 (틀) 정의 -> 클래스로 여러 인스턴스를 만들 수 있음
public class UserTest {

    public static void main(String[] args){
        User_J11 u1 = new User_J11();
        u1.setUsername("haeseon");
        String username = u1.getUsername();
        System.out.println(username);
        System.out.println(u1.getUsername());
    }

  

}