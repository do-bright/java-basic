package j10_메소드;

import java.util.Scanner;

public class MethodEx2 {

    /**
     * 윤년 계산을 매소드를 이용해서 만들기
     * year1,2,3 입력 받음
     * calcLeapYear()
     */

    static boolean calcLeapYear(int year){
        boolean result = false;
		   if (year % 4 == 0 && year%100!=0 || year%400==0){
            result = true;
           }
		    
        return result;
    }

    // static void calcLeapYear2(int year){
    //  if (year<0 || year>4000)
	// 		System.out.println(year+"년은 윤년이 아닙니다.");
	// 	else if (year % 4 == 0 && year%100!=0 || year%400==0)
    //         System.out.println(year+"년은 윤년입니다.");
	// 	else 
    //         System.out.println(year+"년은 윤년이 아닙니다.");
    // }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("년도 입력 (엔터로 구분)");
        int year1,year2,year3 = 0;
        year1 = scanner.nextInt();
        year2 = scanner.nextInt();
        year3 = scanner.nextInt();

        // boolean
        String result1 = calcLeapYear(year1) ? "윤년입니다." : "윤년이 아닙니다.";
        String result2 = calcLeapYear(year2) ? "윤년입니다." : "윤년이 아닙니다.";
        String result3 = calcLeapYear(year3) ? "윤년입니다." : "윤년이 아닙니다.";

        System.out.println("year1은 "+result1);
        System.out.println("year2은 "+result2);
        System.out.println("year3은 "+result3);


        // void
        // calcLeapYear2(year1);
        // calcLeapYear2(year2);
        // calcLeapYear2(year3);

     }
    
}
