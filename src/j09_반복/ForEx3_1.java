package j09_반복;

import java.util.Scanner;

public class ForEx3_1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int start, end=0;
		int dan_start, dan_end=0;

		System.out.println("시작과 끝지점을 입력하세요: ");
		start = scanner.nextInt();
		end = scanner.nextInt();

		System.out.println("단의 시작과 끝지점을 입력하세요: ");
		dan_start = scanner.nextInt();
		dan_end = scanner.nextInt();

		for(int dan=dan_start-2; dan<dan_end-1; dan++){
			dan+=2;
			System.out.println(dan + "단");
				for(int i=start-1; i<end; ){
					i++;
					int result = dan*i;
					System.out.println(dan+" * "+i+" = "+result);
				}
			dan-=2;
		}
	}
}
