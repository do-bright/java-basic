package j06_문자열;

import java.util.Scanner;

public class ScannerEx2 {
	public static void main(String[] args) {
		/*
		 * 이름(name) : 도해선
		 * 연락처(phone) : 010-6559-8814
		 * 직업(job) : 대학생
		 * 성별(gender) : 여
		 * 나이(age) : 24
		 * 주소(address) : 부산광역시 사상구
		 * 
		 * 
		 * 고객의 이름은 도해선이고 직업은 대학생입니다.
		 * 나이는 24살이며 성별은 여성입니다. 
		 * 연락처 : 010-6559-8814
		 * 주소 : 부산광역시 사상구
		 */
		
//		Scanner in = new Scanner(System.in);
//		System.out.print("이름(name) : ");
//		String name = in.next();
//		System.out.print("연락처(phone) : ");
//		String phone = in.next();
//		System.out.print("직업(job) : ");
//		String job = in.next();
//		System.out.print("성별(gender) : ");
//		String gender = in.next();
//		System.out.print("나이(age) :  ");
//		int age = in.nextInt();
//		System.out.print("주소(address) : ");
//		in.nextLine(); // 버퍼 비우기 !!!
//		String address = in.nextLine();
//		System.out.print("이메일(email) : ");
//		String email = in.next();
		
		Scanner in = new Scanner(System.in);
		
		String name = null;
		String phone = null;
		String job = null;
		String gender = null;
		//String age = null;
		int age = 0;
		String address = null;
		String email = null;
		
		System.out.print("이름 : ");
		name = in.next();
		System.out.print("연락처 : ");
		phone = in.next();
		System.out.print("직업 : ");
		job = in.next();
		System.out.print("성별 : ");
		gender = in.next();
		System.out.print("나이 : ");
		//age = in.next();
		age = Integer.parseInt(in.next()); // 형변환
		System.out.print("주소 : ");
		in.nextLine(); // nextLine ; 버퍼 비우기 !!!
		address = in.nextLine();
		System.out.print("이메일 : ");
		email = in.next();
		
		
		System.out.println("고객의 이름은 "+name+"이고 직업은 "+job+"입니다.");
		// System.out.println("나이는 "+ (Integer.parseInt(age)+1) + "살이며 성별은 "+gender+"성입니다.");
		// 나이 string으로 선언 시, int로 형 변환 
		
		// System.out.println("나이는 "+ Integer.toString(age+1) + "살이며 성별은 "+gender+"성입니다.");
		// 나이 int으로 선언 시, string로 형 변환 
		
		
		System.out.println("나이는 "+ age + "살이며 성별은 "+gender+"성입니다.");
		System.out.println("연락처 : "+phone);
		System.out.println("주소 : "+address);
		System.out.println("이메일 : "+email);
		
		
	}
}
