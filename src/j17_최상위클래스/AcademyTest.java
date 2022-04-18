package j17_최상위클래스;

public class AcademyTest {

    public static void main(String[] args) {
        Academy academy = new Academy("아카데미1", "부산", "IT");
        Academy academy2 = new Academy("아카데미1", "부산", "IT");

        System.out.println("주소 비교 : " + (academy == academy2));
        System.out.println("hashcode 비교 : " + (academy.hashCode() == academy2.hashCode()));
        System.out.println("equals 비교 : " + academy.equals(academy2));
        System.out.println(academy);
        System.out.println(academy2);

    }

}
