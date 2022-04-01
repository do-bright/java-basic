package j02_변수;

public class VariableEx2 {

	public static void main(String[] args) {
		/*
		 * 문제1.
		 * 이름 : 도해선
		 * 
		 * 문자형 변수 
		 * firstName1
		 * firstName2
		 * lastName
		 *
		 */
		
		char firstName1='해';
		char firstName2='선';
		char lastName='도';
		
//		System.out.print("이름 :");
//		System.out.print(lastName);
//		System.out.print(firstName1);
//		System.out.print(firstName2);
//		System.out.println();
		
		System.out.println("이름 :"+lastName+firstName1+firstName2);
		// System.out.println(lastName+firstName1+firstName2); // 숫자로 인식 > 숫자로 나옴 > 유니코드
		// System.out.println(""+lastName+firstName1+firstName2); // 문자로 인식 > 문자로 나옴
		// System.out.println(""+(lastName+firstName1+firstName2)); // 우선순위 때매 숫자로 인식 > 숫자로 나옴
		
		char alphabet_a = 'a';
		System.out.println(alphabet_a+1); // 98 출력 a 아스키코드 97에다가 + 1
		System.out.println(""+alphabet_a+1); // a1 출력
		
		
	}

}
