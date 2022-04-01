package j08_조건;

import java.util.Scanner;

public class IfEx4 {
	public static void main(String[] args) {
		
		/*
		 * n사분면 
		 * 0,0 이면 원점이라 출력
		 * y = 0 x + > 1,4 분면이다 
		 */
		
		System.out.println("좌표 입력");
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		String result = null;
		
		
		if (x==0 && y==0) {
			System.out.println("원점"); 
		} else if (x>0) {
			if(y>0) System.out.println("1사분면"); 
			else if(y<0) System.out.println("4사분면"); 
			else System.out.println("1,4사분면");
		}
		else if (x<0) {
			if(y>0) System.out.println("2사분면"); 
			else if(y<0) System.out.println("3사분면"); 
			else System.out.println("2,3사분면");	
		}else if (y>0 && x == 0) {
			System.out.println("1,2사분면");
		}else 
			System.out.println("3,4사분면");
		}
	
	
//		if (x==0 && y==0) {
//			System.out.println("원점"); 
//		} else if (x>0 && y>0) {
//			System.out.println("1사분면"); 
//		} else if (x>0 && y<0) {
//			System.out.println("4사분면"); 
//		} else if (x<0 && y>0) {
//			System.out.println("2사분면"); 
//		} else if (x<0 && y<0) {
//			System.out.println("3사분면"); 
//		} else if (x<0 && y==0) {
//			result = "2,3사분면";
//		} else if (x>0 && y==0) {
//			result = "1,4사분면";
//		} else if (x==0 && y<0) {
//			result = "3,4사분면";
//		} else if (x==0 && y>0) {
//			result = "1,2사분면";
//		} 
		
	

}
