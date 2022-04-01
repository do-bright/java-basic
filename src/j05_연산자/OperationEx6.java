package j05_연산자;


public class OperationEx6 {
	public static void main(String[] args) {
		
		boolean flag = true;
		boolean flag2 = false;
		System.out.println(flag && flag2 ? "AND(참)" : 
							flag || flag2 ? "AND(거짓), OR(참)" : "AND(거짓), OR(거짓)");
		int score = 40;
		System.out.println(score > 89 ? "A학점" : 
							score > 79 ? "B학점" :
							score > 69 ? "C학점" :
							score > 59 ? "D학점" :
							"F학점");
		
		
		
		/*
		 * select == 1 -> 덧셈
		 * select == 2 -> 뺄셈
		 * select == 3 -> 곱셈
		 * select == 4 -> 나눗셈
		 * select == 1,2,3,4 가 아닐 땐 0을 반환
		 */
		
		char select = '1';
		int num1 = 10;
		int num2 = 5;
		int result = 0;

		result = select == '1' ? num1 + num2 : 
				select == '2'? num1-num2 : 
				select == '3'? num1*num2 : 
				select == '4'? num1/num2 :
				0; // result 에 대입하는데 select에 따라 다르게 대입 
		
		//		select == '1'? result = num1 + num2 : 
		//		select == '2'? result = num1-num2 : 
		//		select == '3'? result = num1*num2 : 
		//		select == '4'? result = num1/num2 :
		//		0;
		// 안되는 이유 ? 연산자에서 대입이 안됌 
		// ex) result = num1 = 1 이런식인 거랑 마찬가지임
				
		System.out.println("결과 : "+result);
		
		
		/*
		 * score가 100 ~ 0 사이만 가능
		 * 만약 아니면 X를 return
		 * score가 90 이상이면 A학점 
		 * score가 80 이상이면 B학점 
		 * score가 70 이상이면 C학점 
		 * score가 60 이상이면 D학점 
		 * score가 0~59 이면 F학점 
		 */
		
		char grade = ' ';
		score = -1;
		
		grade = score > 100? 'X' :
				score < 0 ? 'X': 
				score >= 90 ? 'A' : 
				score >= 80 ? 'B' : 
				score >= 70 ? 'C' : 
				score >= 60 ? 'D': 
				'F';
		
		System.out.println("결과 : "+grade);	
	}
}
