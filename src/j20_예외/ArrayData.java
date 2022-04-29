package j20_예외;

import java.io.IOException;

public class ArrayData {
	
	public void printArray(String[] array) throws IOException, IndexOutOfBoundsException{
		for(int i=0; i<array.length+1; i++) {
			System.out.println(array[i]);
		}
		throw new CustomException();
	}
	
	public void callException() throws CustomException{
		// 10 개 일 때 예외 만드는 게 목적 
		int i = 10; 
		
		if (i==10) {
			throw new CustomException("인덱스 10은 해당 배열의 크기를 초과했습니다. \n 더이상 데이터를 추가할 수 없습니다."); 
			// 10개 일 때 예외 날리기 with 메세지
		}
	}

}
