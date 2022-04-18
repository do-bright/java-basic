package j17_최상위클래스.main;

import j17_최상위클래스.config.Context;
import j17_최상위클래스.controller.MainController;

public class MainApplication {

    public static void main(String[] args) {
        Context context = Context.getInstance();
        context.setting();
        MainController mainController = context.getMainController();
        mainController.index();
    }

}
