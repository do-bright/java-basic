package j06_문자열;

import java.util.Scanner;

public class ScannerEx3 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		//String b = null;
		int c = 0;
		
		System.out.print("첫번째 수 입력 : ");
		a=in.nextInt();
		System.out.print("두번째 수 입력 : ");
		b=in.nextInt();
		//in.nextLine(); // nextLine 쓰기 전 버퍼 비우기 
		//b = in.nextLine();
		//Integer.parseInt(b); // String으로 입력받은 b를 int로 바꾸기
		System.out.print("세번째 수 입력 : ");
		c=in.nextInt();
		
		System.out.println("세 수의 합 : "+(a+b+c));
		
		
		
		
		
		
		
	}
}
