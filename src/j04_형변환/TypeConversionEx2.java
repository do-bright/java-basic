package j04_형변환;

public class TypeConversionEx2 {

	public static void main(String[] args) {
		// 최저 9160원
		// 4주 근무
		// 1,3 주는 3일
		// 2,4 주는 5일
		// 3,4 주는 시급의 5%를 더 추가 
		// 하루 8시간
		// 월급은 얼마인가 ?
		
		/*
		 * 내 코드
		 */
		/*final int HOURLY_WAGE = 9160;
		double monthlyPay = 0;
		double first,second,third,fourth = 0;
		first = HourlyWage*8*3;
		second = HourlyWage*8*5;
		third = (HOURLY_WAGE+(HOURLY_WAGE*0.05))*8*3;
		fourth = (HOURLY_WAGE+(HOURLY_WAGE*0.05))*8*5;
		monthlyPay = first + second + third + fourth;
		monthlyPay = monthlyPay - monthlyPay%10;
		System.out.println("직원의 월급은 "+(int)monthlyPay+"입니다"); */
		
		/*
		 * 답 코드
		 */
		final int HOURLY_WAGE = 9160;
		int monthlyPay = 0;
		double bonus = HOURLY_WAGE*0.05;
		
		double week1 = HOURLY_WAGE * 8 * 3;
		double week2 = HOURLY_WAGE * 8 * 5;
		double week3 = (HOURLY_WAGE+bonus)* 8 * 3;
		double week4 = (HOURLY_WAGE+bonus)* 8 * 5;
		
		monthlyPay = (int)(week1+week2+week3+week4);
		//monthlyPay = ((int)((week1+week2+week3+week4)/10))*10;
		monthlyPay = monthlyPay - monthlyPay%10;
		System.out.println("직원의 월급은 "+monthlyPay+"입니다.");
		


		

	}

}
