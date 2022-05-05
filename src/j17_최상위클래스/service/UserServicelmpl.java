package j17_최상위클래스.service;
import j17_최상위클래스.repository.UserArray;
import j17_최상위클래스.repository.user.User;
import lombok.RequiredArgsConstructor;
import lombok.Builder;
import java.util.Scanner;


@RequiredArgsConstructor
public class UserServicelmpl implements UserService {
	private final UserArray userArray;
		
    @Override
    public User loginUser(Scanner scanner) {
		String username, password;
		System.out.println("[로그인]");
        System.out.println("아이디 : ");
        username = scanner.nextLine();
        System.out.println("비밀번호 : ");
        password = scanner.nextLine();
        
        User[] userList = userArray.getuserArray();
        User user = null;
        for(User tempUser : userList){
            if (tempUser.getUsername().equals(username) && tempUser.getPassword().equals(password)){
                user = tempUser;
                break;
            }
            else 
            	System.out.println("일치하는 회원이 없습니다.");
        }
        return user;
    }
    
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