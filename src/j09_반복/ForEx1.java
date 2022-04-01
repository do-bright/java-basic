package j09_반복;

public class ForEx1 {

	public static void main(String[] args) {

		for (int i = 0; i<10 ; i++){
			System.out.println(i);
			System.out.println(i+1);
		}
		
		// 0-9
		int j = 0;
		for (; j<10; j++) {
			System.out.println(j);
		}
		
		// 1-10
		int x = 0;
		for (; x<10; ) {
			x++;
			System.out.println(x);
		}
		
		// 두개도 사용 가능 
		for(int k=0, n=0; k<10 || n<10; k++, n++) {
			System.out.println(k);
			System.out.println(n);	
		}
	}

}
