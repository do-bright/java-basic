package j16_static;

public class Student {
    private static int SCAutoIncrement; // Student Code
    private int studentCode = 20220000;
    private String name; 
    // private 외부(StaticEx ..) 접근 불가

    public Student(String name){
        studentCode += ++ SCAutoIncrement;
        this.name = name;
    }

    public void studentInfo(){
        System.out.println("학번 : "+ studentCode);
        System.out.println("이름 : "+ name);
    }

    
}
