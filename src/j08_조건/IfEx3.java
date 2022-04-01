package j08_조건;

import java.util.Scanner;

public class IfEx3 {

	public static void main(String[] args) {
		
		/**
		 * score (점수) = 정수형 숫자 (int)
		 * grade (평점) = A ~ F (String)
		 * result = null; (String) 
		 * 점수를 입력 받는다.
		 * 
		 * 성적을 입력해 주세요 : 
		 * 성적은 0 ~ 100 사이만 인정
		 * 아닐 시 result에 "해당 점수는 계산할 수 없습니다."를 대입 후 출력
		 * 
		 * 마지막 return 값은 
		 * result = "해당 학생의 성적은 00점이며, 평점으로 변환시 0학점입니다.";
		 * 
		 * 평점 환산
		 * 90 ~ 100 A
		 * 80 ~ 89 B
		 * 70 ~ 79 C
		 * 60 ~ 69 D
		 * 0 ~ 59 F
		 * 
		 */
		
		String result = null;
		String grade = null;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("성적을 입력해 주세요 : ");
		int score = scanner.nextInt();
		
		if (score < 0 || score > 100) { // 범위에 포함되냐 아니냐를 먼저 체크
			result = "해당 점수는 계산할 수 없습니다.";
		} else {	
			if (score > 89) {
				grade = "A";
			} else if (score > 79) {
			grade = "B";
			} else if (score > 69) {
				grade = "C";
			} else if (score > 59) {
				grade = "D";
			} else {
				grade = "F";
			}
			result = "해당 학생의 성적은 " + score + "점이며 평점으로 변환시 " + grade +"학점입니다.";
		}
		
		System.out.println(result);
		

//		if (score >= 90 && score <= 100) {
//			grade = "A";
//		} 
//		else if (score >= 80 && score <= 89) {
//			grade = "B";
//		} 
//		else if (score >= 70 && score <= 79) {
//			grade = "C";
//		}
//		else if (score >= 60 && score <= 69) {
//			grade = "D";
//		}
//		else if (score >= 0 && score <= 59) {
//			grade = "F";
//		}
//		
//		if (score < 0 || score > 100)
//			result = "해당 점수는 계산할 수 없습니다.";
//		else 
//			result = "해당 학생의 성적은 " + score + "점이며 평점으로 변환시 " + grade +"학점입니다.";
//		
//	
//		System.out.println(result);
//		
	}
}
