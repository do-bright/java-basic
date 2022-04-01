package j08_조건;

import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
		
		String result = null;
		char grade = ' ';
		//String grade = null;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("성적을 입력해 주세요 : ");
		int score = scanner.nextInt();
		
		if (score < 0 || score > 100) { 
			System.out.println("해당 점수는 계산할 수 없습니다."); 
		} else {
			int score2 = score  == 0? 0 : score / 10; // 0일 땐 10으로 안 나눠짐 -> 에러가 뜸 
			switch(score2) {
				case 10:
					//grade = 'A';
					//break; // 10 9 모두 A 학점이라 생략 가능 
				case 9:
					grade = 'A';
					break;
				case 8:
					grade = 'B';
					break;
				case 7:
					grade = 'C';
					break;
				case 6:
					grade = 'D';
					break;
				default:
					grade= 'F';
				}
		}
		System.out.println("해당 학생의 성적은 " + score + "점이며 평점으로 변환시 " + grade +"학점입니다.");
	}
}