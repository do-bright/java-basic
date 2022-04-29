package j17_최상위클래스.config;
import lombok.Getter;
import java.util.Scanner;

import j17_최상위클래스.controller.MainController;
import j17_최상위클래스.repository.UserArray;
import j17_최상위클래스.service.UserServicelmpl;
import lombok.Getter;

@Getter
// @Setter는 있으면 안됌 설정은
public class Context {
    private static Context instance;
    private Scanner scanner;
    private MainController mainController;
    private UserService userService;

    private Context() {
        // 일반 객체
        scanner = new Scanner(System.in);

        UserArray userArray = new UserArray();

        // 서비스 객체
        userService = new UserServicelmpl(userArray);

        // 컨트롤러 객체
        mainController = new MainController(userService);
    }

    public static Context getInstance() {
        if (instance == null) {
            instance = new Context();
        }
        return instance;
    }

    public Scanner getScanner() {
        return null;
    }

}
