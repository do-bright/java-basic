package j09_반복;

public class WhileEx1 {

	public static void main(String[] args) {
		 int i=0;
		 int result=0;
		 while (i<100) {
//			 i++;
//			 result+=i;
			 result += (++i); // 선증가 후 result 에 저장 
		 }
		 
		 System.out.println(result);

	}

}
