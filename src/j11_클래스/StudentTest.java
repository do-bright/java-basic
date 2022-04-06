package j11_클래스;

public class StudentTest{
    public static void main(String[] args){
        new Student_J11(); // Student_J11 객체 생성 (인스턴스)
        System.out.println(new Student_J11());
        System.out.println(new Student_J11());
        // 위 셋 다 다른 객체임 출력값 = 메모리의 주소

        int num = 10;

        Student_J11 s1 = new Student_J11(); 
        // 생성해서 클래스 변수에 담음 -> 인스턴스 생성 (만들고 + 변수에 담는 것까지)
        s1.schoolName = "동서대학교";
        s1.name = "도해선";
        System.out.println(s1.schoolName);

        Student_J11 s2 = new Student_J11();
        s2.schoolName = "부산대학교";
        s2.name = "도재";
        System.out.println(s2.schoolName);

        s1.goToSchool();
        s2.goToSchool();

        // Student_J11 s3;
        // s3.goToSchool(); 바로 실행 못함 = 메소드 바로 실행 X
        // 인스턴스를 생성하고 -> 메소드를 쓸 수 있음


    }

}
