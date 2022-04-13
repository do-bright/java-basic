package j13_배열;

import java.util.Scanner;

public class CustomArrayTest {

    public static void main(String[] args){

        // String[] stra = new String[0];
        // System.out.println(stra.length);

        UserArray userArray = new UserArray(new CustomArray());
        // UserArray -> CustomArray 까지 생성

        Scanner scanner = new Scanner(System.in);

        while(true){
            char cmd = ' ';

            System.out.println("사용자 관리 프로그램");
            System.out.println("1. 사용자 추가");
            System.out.println("2. 사용자 전체 조회");
            System.out.println("q. 프로그램 종료");
            System.out.println("----------------------");
            System.out.print("메뉴를 선택하세요 : ");
            cmd = scanner.next().charAt(0);
            scanner.nextLine();

            if(cmd=='1'){
                userArray.insertName(scanner);
                // addName 은 여기서 가능하면 안됌 UserArray 를 통해서만 가능해야
                // -> addName 함수 private 
            }else if(cmd == '2'){
                userArray.selectNameAll();

            }else if(cmd == 'q'){
                System.out.println("프로그램 종료중 ..");

                for (int i=0; i<100; i++){
                    System.out.println((i+1)+"/100"); 
                    // 100까지 숫자 올라가면서 출력
                    try{
                        Thread.sleep(100); // 0.1 초 멈춤, 시간 간격두면서 출력 (숫자 낮을수록 빠르게)
                    } catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }

                break;
            }else{

            }

            System.out.println("프로그램이 종료되었습니다.");


        }

    }
    
}
