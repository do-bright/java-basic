package j17_최상위클래스.controller;

import j17_최상위클래스.config.Context;
import j17_최상위클래스.repository.user.User;
import j17_최상위클래스.service.UserService;

@RequiredArgsConstructor
public class MainController {

    private final Context context;
    private final UserService userService;

    // // final 이라 아래에서 무조건 매개변수로 받아야함
    // public MainController(UserService userService) {
    // this.userService = userService;
    // } -> @RequiredArgsConstructor

    public void index() {
        User user = userService.addUser(context.getScanner());
        System.out.println(user);
    }

}
