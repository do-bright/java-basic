package j17_최상위클래스.service;

import java.util.Scanner;

import j17_최상위클래스.repository.UserArray;
import j17_최상위클래스.repository.user.User;

@RequiredArgsConstructor
public class UserServicelmpl implements UserService {
    private final UserArray userArray;

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
        User user = User.builder()
            .username(username)
            .password(password)
            .name(name)
            .email(email)
            .build();

        userArray.add(user);
        return user;
    }

    @Override
    public User getUserByUserName(Scanner scanner) {
        System.out.println("찾으실 사용자의 아이디를 입력하세요 : ");
        String username = scanner.nextLine();

        User[] userList = userArray.getuserArray();
        User user = null;
        for(User tempUser : userList){
            if (tempUser.getUsername().equals(username)){
                user = tempUser;
                break;
            }
        }
        return user;
    }

    @Override
    public User[] getUserAll() {
        return userArray.getuserArray();
    }

}
