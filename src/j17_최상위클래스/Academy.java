package j17_최상위클래스;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Builder
// @NoArgsConstructor // 기본생성자
@RequiredArgsConstructor
@AllArgsConstructor // 전체 생성자
@Getter
@Setter
@EqualsAndHashCode //
@ToString
public class Academy {
//	@NonNull
    private final String name;
//	@NonNull
    private final String address;
    private String subject;

    // 비면 안되는 변수에
    // 1. @NonNull 달아주기 + NoArgs
    // 2. 변수에 final 붙여주기 NoArgs X
    // final = 상수라 초기화가 필요, NoArgs를 쓰면 초기화를 안해줌)
    // final 쓰면 기본생성자 사용 못함 전체생성자로 접근해야 함

    /* lombok 사용 전 
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
     * 
     */
}
