package j10_메소드;

import java.util.Scanner;

public class MethodEx3{

    /**
     * 최대 최소 구하기
     * num1,2,3 입력 받기
     * 
     * max();
     * min();
     * 각각 최대 최소 구하는 함수 만들기
     * 
     * 매개변수 1,2,3 전달해서 결과 출력
     * 최대값은 000입니다.
     * 최소값은 000입니다. 
     * 
     * 배열 사용 XX
     */

    static int max(int num1,int num2, int num3){
        int max = 0;
        if (num1 > num2){
            max= num1;
        } else {
            max= num2;
        }
        if (max < num3){
            max= num3;
        }
        return max;
    }

    // 메소드 오버로딩
    /*
     * 1. 같은 메소드 명을 쓸 수 있다.
     * 2. 매개변수가 다르면 같은 기능을 하더라도 오류 없이 정의할 수 있다.
     * 3. return 자료형이 다르다고 해서 매소드 오버로딩을 할 수 있는 것은 아니다.
     */
    // static int max(int num1,int num2, int num3, int num4){
    //     int max = 0;
    //     if (num1 > num2){
    //         max= num1;
    //     } else {
    //         max= num2;
    //     }
    //     if (max < num3){
    //         max= num3;
    //     }
    //     if (max < num4){
    //         max = num4;
    //     } 
    //     return max;
    // }

    // 틀린 방법 
    // int max = num1;
    // if (num2>num1)
    //     max = num2;
    // if (num3>num1)
    //     max = num3;
    // if (num2>num3)
    //     max = num2;
    // if (num3>num2)
    //     max = num3;

    static int min(int num1,int num2, int num3){
        int min = 0;
        if(num1 < num2){
            min = num1;
        } else {
            min=num2;
        }
        if(min > num3){
            min = num3;
        }
        return min;
    }

    // 틀린 방법 
    // int min = num1;
    // if (num2<num1)
    //     min = num2;
    // if (num3<num1)
    //     min = num3;
    // if (num2<num3)
    //     min = num2;
    // if (num3<num2)
    //     min = num3;


    public static void main(String[] args){

        int num1,num2,num3 = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자 세개를 입력 (엔터로 구분)");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        System.out.println("최대값은 "+max(num1,num2,num3)+"입니다.");
        System.out.println("최소값은 "+min(num1,num2,num3)+"입니다.");

     }
    
}
