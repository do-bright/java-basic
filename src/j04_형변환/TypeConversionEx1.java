package j04_형변환;

public class TypeConversionEx1 {

	public static void main(String[] args) {

		/* 
		 업 캐스팅 (실수 > 정수 > 문자 순으로 높음)
		 넣을 수 있음
		 */
		
		// 문자 -> 정수
		char a = 'a';
		int b = a;
		// int b = int(a);
		int c = 'a';
		System.out.println("문자 -> 정수 : "+b); // 출력하면 97 나옴 (아스키코드 a)
		
		// 정수 -> 실수
		int f = 5000;
		double g = f;
		System.out.println("정수 -> 실수 : "+g);
		
		/* 
		다운캐스팅 
		넣을 수 없음 (공간부족)
		 */
		
		// 정수 -> 문자
		int d = 1000;
		char e = (char)d;
		System.out.println("정수 -> 문자 : "+e); // 유니코드로 변환해서 출력
		
		// 실수 -> 정수
		double h = 30.5533;
		int i = (int)h;
		System.out.println("실수 -> 정수 : "+i);
		
	}
}
