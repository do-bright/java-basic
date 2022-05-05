package j17_최상위클래스;

import j16_static.Student;

public class ObjectEx {
    public static void main(String[] args) {
        Object obj = new Object();
        String toString = obj.toString();
        System.out.println(toString);

        Student student = new Student("도해선");
        System.out.println(student);
        System.out.println(student); // student = student.toString()

        User user = new User(20180582, "hs", "1234", "도해선", "1234@naver.com");
        User user2 = new User(20180582, "hs", "1234", "도해선", "1234@naver.com"); 
        // user와 user2는 다른 주소사용하니까 다른 객체
        // 하지만 사용자 입장에선 내용이 같기에 같은 유저임 > 비교 필요
        
        System.out.println(user == user2); // 주소값 비교 > 주소값이라 False로 나옴 ( 사용자 입장 X )
        // System.out.println(10 == 10); 은 True로 나옴 값이 같아서가 아니라 리터럴 상수라 주소 값이 같음 
        
        System.out.println(user.equals(user2)); // 원래 equals 도 주소값 비교인데 overriding 해줘서 다르게 결과
        // user든 user2든 ObjectEx든 모두 object(최상위클래스)를 상속 받고 있음 = 업캐스팅 가능하다 ex. object o = user2
        
        System.out.println(user.hashCode() == user.hashCode());
    
    }
}
