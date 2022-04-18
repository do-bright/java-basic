package j17_최상위클래스.repository.user;

// 엔티티를 위한 어노테이션
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
// 정보만 담는 객체 = 엔티티 클래스
public class User {
    private String username;
    private String password;
    private String name;
    private String email;

}
