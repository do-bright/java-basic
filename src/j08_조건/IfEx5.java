package j08_조건;

import java.util.Scanner;

public class IfEx5 {
	public static void main(String[] args) {
		
		/*
		 * 윤년 체크 
		 */
		
		System.out.println("년도 입력");
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		int result = 0;
		
		if (year<0 || year>4000) // 범위에 포함되냐 아니냐를 먼저 체크
			result = 2;
//		else if ((year % 4 == 0 && year%100!=0) || (year % 4 == 0 && year%400==0))
		else if (year % 4 == 0 && year%100!=0 || year%400==0)
			result = 1;
		else 
			result = 0;
		System.out.println(result);

	}
}
