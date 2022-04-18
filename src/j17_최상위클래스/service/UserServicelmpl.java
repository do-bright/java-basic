package j17_최상위클래스.service;

import java.util.Scanner;

public class UserServicelmpl implements UserService {

    @Override
    public User addUser(Scanner scanner) {
        String username, password, name, email;
        System.out.println("[사용자 정보 추가]");
        System.out.println("아이디 : ");
        username = scanner.nextLine();
        System.out.println("비밀번호 : ");
        password = scanner.nextLine();
        System.out.println("이름 : ");
        name = scanner.nextLine();
        System.out.println("이메일 : ");
        email = scanner.nextLine();

        // User user = new User(username, password, name, email);
        // P) 이렇게 해주면 전체생성자로만 넣어줄 수 있음 (순서도 알아야함)
        // S) builder 사용 (static 메소드) (순서 몰라도 상관 없음 / 원하는 것만 값 넣기 가능)
        // User user = User.builder()
        // .username(username)
        // .password(password)
        // .name(name)
        // .email(email)
        // .build();
        return User.builder()
                .username(username)
                .password(password)
                .name(name)
                .email(email)
                .build();
    }

    @Override
    public User getUserByUserName(String username) {
        return null;
    }

    @Override
    public User[] getUserAll() {
        return null;
    }

}
