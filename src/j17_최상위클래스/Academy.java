package j17_최상위클래스;

import lombok.NoArgsConstructor;

@Builder
@RequiredArgsCOnstructor()
@NoArgsConstructor // 기본생성자
@AllArgsConstructor // 전체 생성자
@Getter
@Setter
@EqulasAndHashCode //
@ToString

public class Academy {
    private final String name;
    private final String address;
    private final String subject;
    private final String age;

    // final + NoArgsConstructor 같이 사용 X
    // final 쓰면 기본생성자 사용 못함 전체생성자로 접근해야 함

    // import java.util.Objects;

    // public class Academy {
    // private String name;
    // private String address;
    // private String subject;
    // private String age;

    // public Academy(String name, String address, String subject) {
    // super();
    // this.name = name;
    // this.address = address;
    // this.subject = subject;
    // }

    // public void setName(String name) {
    // this.name = name;
    // }

    // public void setAddress(String address) {
    // this.address = address;
    // }

    // public void setSubject(String subject) {
    // this.subject = subject;
    // }

    // public String getName() {
    // return name;
    // }

    // public String getAddress() {
    // return address;
    // }

    // public String getSubject() {
    // return subject;
    // }

    // @Override
    // public int hashCode() {
    // return Objects.hash(name, address, subject);
    // }

    // @Override
    // public boolean equals(Object obj) {
    // if (this == obj)
    // return true;
    // if (obj == null)
    // return false;
    // if (getClass() != obj.getClass())
    // return false;
    // return this.hashCode() == obj.hashCode();
    // }

    // @Override
    // public String toString() {
    // return "Academy [name=" + name + ",address=" + address + ", subject=" +
    // subject + "]";
    // }
}
