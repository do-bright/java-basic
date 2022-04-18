package j17_최상위클래스;

import j16_static.Student;

public class ObjectEx {
    public static void main(String[] args) {
        Object obj = new Object();
        String toString = obj.toString();
        System.out.println(toString);

        Student student = new Student("도해선");
        System.out.println(student);
        System.out.println(student);

        User user = new User(20180582, "hs", "1234", "도해선", "1234@naver.com");
        User user2 = new User(20180582, "hs", "1234", "도해선", "1234@naver.com");
        System.out.println(user == user2); // 주소값 비교
        // 10 == 10 리터럴 상수라서 위치하고 있는 주소 값이 같음 
        System.out.println(user.equals(user2)); // 원래 equals 도 주소값 비교인데 overriding 해줘서 다르게 결과
        System.out.println(user.hashCode() == user.hashCode());
    
    }
}
