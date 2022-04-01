package j03_상수;

public class ConstantEx {
	public static void main(String[] args) {
		// 상수 선언
		final double PI = 3.141592; 
		
		// 최대, 최소, 경로 등에 사용 
		final int MAX_NUM = 100;
		final int MIN_NUM;
		MIN_NUM = 0;
		// 초기화 되고 나면 변경 x
		
		System.out.println("최대값 "+MAX_NUM);
		System.out.println("최소값 "+MIN_NUM);
		
	}
}
