package j05_연산자;

public class OperationEx7 {

	public static void main(String[] args) {
		int a = 10;
		
		// 삼항 연산자 사용한 경우
		String flag = a > 5 || a % 2 == 0? "참": "거짓";
		//String flag = a > 5 || a%2 == 0? flag = "참": flag = "거짓"; 이거 아님 이건 연산자이기에 a = b = 2 이런식으로 쓰는 거랑 같음 
		
		int b = a+2;
		String flag2 = "false";
		
		// 삼항 연산자 사용한 경우
		flag2 = a > 5 ? "참":"거짓";
		
		// if else 조건문 사용한 경우
		if (a>5) {
			flag = "참";
		}
		else {
			flag = "거짓";
		}
		

	}

}
