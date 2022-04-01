package j09_반복;

public class WhileEx3 {
	
	/*
	 * 운동장 한 바퀴당 코끼리코 10바퀴
	 * 총 다섯 바퀴 돌 것임
	 */

	public static void main(String[] args) {
		int 운동장 = 0;

		while(운동장 <5) {
			운동장++;
			System.out.println("운동장 "+운동장+"바퀴째");
			int 코끼리코 = 0; // 지역 변수로 (밖에서 안 쓰면 굳이 전역으로 X)
			// 코끼리코=0; 이거 없으면 1바퀴째만 코끼리코 10번 돌고 2바뀌째 이후부턴 돌지 않음
			// 초기화 필요 ! 
			
			while(코끼리코 <10) {
				코끼리코++;
				System.out.println("코끼리코 "+코끼리코+"번");
			}
			
		}

	}

}
