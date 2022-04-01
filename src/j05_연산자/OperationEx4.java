package j05_연산자;

/**
 * 논리 연산자
 * 
 * and && > 곱 
 * T && T = T (1*1)
 * F && T = F (1*0)
 * F && F = F (0*0)
 * 모두 T여야만 결과가 T
 * 
 * or || > 합
 * T || T = T (1+1)
 * F || T = T (0+1)
 * F || F = F (0+0)
 * 모두 F여야만 결과가 F
 * 
 * not ! > 부정(반전)
 * !T = F
 * !F = T
 * ex) !(true||ture) => false 
 * true && !false => true
 * 
 * 0이 아니면 무조건 true
 * 0이면 false
 */

public class OperationEx4 {
	public static void main(String[] args) {
		System.out.println(true || false);
		System.out.println(true && false);
		System.out.println(true && !false);
	}
}
