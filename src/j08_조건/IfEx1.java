package j08_조건;

public class IfEx1 {

	public static void main(String[] args) {
		
		//if (조건식) 해당 조건이 참일 때 실행문
		if(true) System.out.println("참");
		
		if(false) System.out.println("거짓 > 이거 실행 안됨");
		//else 해당 조건이 거짓일 때 실행문
		else System.out.println("위의 조건이 거짓일 때 실행됨");
		
		//else System.out.println("거짓"); 기준이 없어서 에러가 뜸 
		
		if(true) 
			if(true) 
				if(true) 
					if(true) System.out.println("참");
					else System.out.println("거짓");
		
		System.out.println("=================================================");
		
		//if(true) System.out.println("참");
		//System.out.println("참?");
		
		if(true) { 
			System.out.println("참");
			System.out.println("참?");
			}
		
		if(false) { // 거짓이라 실행 안됨 
			System.out.println("참");
			System.out.println("참?");
		} else {
			System.out.println("거짓");
		}

	}

}
