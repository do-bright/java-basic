package j06_문자열;

import java.util.Scanner;

public class ScannerEx4 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String a = null;
		String b = null;
		
		System.out.println("두 문자를 입력하세요 : ");
		a = in.next(); // 공백 미포함
		b = in.nextLine(); // 공백 포함
		
		System.out.println("결과 : "+a+b);
	
	}
}
