package j05_연산자;

public class OperationEx1 {

	public static void main(String[] args) {
		int a = 5;
		int b = 2;
		// 나눗셈
		System.out.println(a/b);
		
		/*
		 double 만들기 
		 */
		// ver1
		System.out.println((double)a/b);
		// ver2
		double c = 5;
		int d = 2;
		System.out.println(c/d); // 큰 자료형 따라감
		
		// 나머지
		// 활용 ; 배수, 홀수 짝수
		System.out.println(c%d); 
		
		
		

	}

}
