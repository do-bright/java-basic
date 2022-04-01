package j05_연산자;

public class OperationEx2 {

	public static void main(String[] args) {
		// 증감 연산자
		int num = 100;
		int num2 = num++;
		System.out.println(num2);
		// 선증가 101 후증가 100
		num2 = num;
		System.out.println(num2);
		
		int a = 10;
		System.out.println("========증가========");
		System.out.println(++a);
		System.out.println(a);
		System.out.println(a++);
		System.out.println(a);
		
		System.out.println("========감소========");
		System.out.println(--a);
		System.out.println(a);
		System.out.println(a--);
		System.out.println(a);
	}

}
