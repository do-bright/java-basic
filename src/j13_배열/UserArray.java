package j13_배열;

import java.util.Scanner;

public class UserArray {
    private CustomArray customArray;

    public UserArray(CustomArray customArray){
        this.customArray = customArray;
    }

    public void insertName(Scanner scanner){
        System.out.println("[이름 추가]");
        System.out.println("이름을 입력하세요 : ");
        addName(scanner.nextLine());
    }

    public void selectNameAll(){
        String[] strArray = customArray.getStrArray();

        System.out.println("[이름 전체 조회]");
        for (int i=-0; i< strArray.length; i++){
            System.out.println((i+1)+"번: "+strArray[i]);
        }
        System.out.println();
    }

    private void addName(String name){
       customArray.add(name); // 배열 추가하러 CustomArray.java 로 보내기
        System.out.println("추가된 이름 : ");
        System.out.println(getNameByLatestAddName());

    }

    private String getNameByLatestAddName(){ // 젤 마지막 이름만 출력
        String[] strArray = customArray.getStrArray();
        return strArray[strArray.length-1];
    }
}
