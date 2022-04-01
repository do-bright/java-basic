package j09_반복;

public class WhileEx4 {

	public static void main(String[] args) {
		int dan = 0;
		
// 1-9 단
//		while(dan<9) {
//			dan++;
//			System.out.println(dan+"단");
//			int num = 0;
//			
//			while (num<9) {
//				int result = dan * (++num);
//				System.out.println(dan+" X "+num+" = "+result);
//			}
//			System.out.println( );
//		}
		
// 2단부터 1번째 방법
		while(dan<8) { // 2단부터니까 반복횟수는 총 8번 = 9-1 
			dan += 2; // 2단부터 
			System.out.println(dan+"단");
			int num = 0;
			
			while (num<9) {
				int result = dan * (++num); // num 선증가 시켜주고 dan 곱해서 result에 대입
				System.out.println(dan+" X "+num+" = "+result);
			}
			dan -= 1; // 2 4 6 8 증가하는 걸 -1 빼주는 거 (1만큼만 증가하도록)
			System.out.println( );
		}
		
// 2단부터 2번째 방법 
//		int dan = 1;
//		
//		while(dan<9) {
//			dan++;
//			System.out.println(dan+"단");
//			int num = 0;
//			
//			while (num<9) {
//				int result = dan * (++num);
//				System.out.println(dan+" X "+num+" = "+result);
//			}
//			System.out.println( );
//		}
		
	}
}
