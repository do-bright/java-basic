package j09_반복;

public class WhileEx2 {

	/*
	 * 2단 구구단 찍기 
	 * 
	 * 2 X 1 = 2
	 * 2 X 2 = 4
	 * ...
	 * 2 X 9 = 18
	 */
	
	public static void main(String[] args) {
		int dan = 2;
		int num = 0;
		int result = 0;
		
		while (num<9) {
			result = dan * (++num);
//			num++;
//			result = dan * num;
			System.out.println(dan+" X "+num+" = "+result);
		}

	}

}
