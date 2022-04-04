package j10_메소드;

public class MethodEx1 {

    static int sum(int x, int y){
        return x+y;
    }

    // static void sum(int x, int y){
    //     System.out.println(x+y);
    // }

    static boolean oddOrEven(int num) {
        boolean result=false;
        if(num%2 != 0){
            return true;
        }
        // else{
        //     return false;
        // }
        return result;
    }

    public static void main(String[] args){
        System.out.println(sum(10,20));
        int num = sum(10,20);
        System.out.println(num);
        boolean tAndF = oddOrEven(10);
        System.out.println(tAndF);

    }
    
}
