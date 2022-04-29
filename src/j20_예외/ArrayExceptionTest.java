package j20_예외;

import java.io.IOException;

public class ArrayExceptionTest {

	public static void main(String[] args) throws NullPointerException, IOException {
		String[] names = {"도해선","김정우","김도영"};
		
		try {
			for (int i=0; i<names.length; i++) {
			//		for (int i=0; i<names.length+1; i++) { // 이렇게 되면 +1 까지 도니까 초과로 돔 ; ArrayIndexOutOfBoundsException
			// 오류때매 밑에 코드가 발생하지 않는 경우가 발생 ( 데이터를 저장하거나 해야하는데 여기서 그냥 오류나고 종료 되면 ㄴㄴ )
				
				System.out.println(names[i]);
			}
		}catch (IndexOutOfBoundsException e) {
			System.out.println("예외가 발생 하였습니다.");
			for (int i=0; i<names.length; i++) {
				System.out.println(names[i]); // 예외 발생했을 때 다른 코드 실행도 설정 가능함 
			}
		}catch (NullPointerException e) {
			System.out.println("객체 데이터 null 오류");
		}catch (Exception e) { // 내가 예상하지 못한 에러가 있을 때를 방지
			e.printStackTrace();
		}finally {
			System.out.println("예외의 발생 여부에 상관없이 발생");
		}
		
		ArrayData arrayData = new ArrayData();
		
//		try {
//			arrayData.printArray(names);
//		} catch (IndexOutOfBoundsException | IOException e) {
//			e.printStackTrace();
//		}
		
		try {
			arrayData.callException();
		}catch(CustomException e) {
			e.printStackTrace();
		}
	

		System.out.println("데이터 저장");
		System.out.println("프로그램 종료");

	}

}
