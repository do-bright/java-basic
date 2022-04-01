package j09_반복;

import java.util.Scanner;

public class ForEx3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int dan=0;

		System.out.println("단 수를 입력하세요: ");
		dan = scanner.nextInt();

		// for (int i=0; i<9; i++){
		// 	System.out.println(dan+" * "+(i+1)+" = "+dan*(i+1));
		// }

		for (int i=0; i<9; i++){
			int result = dan*(i+1);
			System.out.println(dan+" * "+(i+1)+" = "+result);
		}

		// for (int i =0; i<8; i++)
		// {
		// 	i+=2;
		// 	System.out.println(i+" 단");
		// 		for (int j=0; j<9; )
		// 		{
		// 			j++;
		// 			System.out.println(i+" * "+j+" = "+i*j);
		// 		}
		// 		// ver2
		// 		// for (int j=0; j<9; j++)
		// 		// {
		// 		// 	j++;
		// 		// 	System.out.println(i+" * "+j+" = "+i*j);
		// 		// 	j--;
		// 		// }
		// 	i-=2;
		// }
	}

}
