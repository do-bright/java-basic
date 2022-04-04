package j09_반복;

import java.util.Scanner;

public class Star {

    public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자 입력 : ");
        int num = scanner.nextInt();

        // *
        // **
        // ***
        // ****
        // *****

        for(int i=0; i<num; i++){
            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        //     *
        //    **
        //   ***
        //  ****
        // *****

        for(int i=0; i<num; i++){
            for(int j=0; j<num-1-i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // *****
        // ****
        // ***
        // **
        // *

        for(int i=0; i<num; i++){
            for(int j=0; j<num-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // *****
        //  ****
        //   ***
        //    **
        //     *

        for(int i=0; i<num; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<num-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        //     *
        //    ***
        //   *****
        //  *******
        // *********

        for(int i=0; i<num; i++){
            for(int j=0; j<num-1-i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<2*i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
	}
    
}
