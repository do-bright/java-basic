package j13_배열;

public class DoubleArrayTest { // 2차원 배열
    public static void main(String[] args){
        int[][] numbers = new int[3][2]; // 크기임 index아님
        numbers[0][0]=1;
        numbers[0][1]=0;
        numbers[1][0]=1;
        numbers[1][1]=0;
        numbers[2][0]=1;
        numbers[2][1]=0;

        for(int i=0; i<numbers.length; i++){ // 전체 행의 갯수 
            for(int j=0; j<numbers[i].length; j++){ // 행 하나를 찝어서 행 안에 있는 것의 갯수
                System.out.println(numbers[i][j]);
            }
        }

    }
    
}
