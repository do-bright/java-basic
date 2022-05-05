package j17_최상위클래스.repository.user;

import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

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

//  @Builder annotation으로 대체 
//    public static User builder() {
//        return new User();
//    }
   
//    public User username (String username) {
//        this.username = username;
//        return this;
//    }
//
//    public User password (String password) {
//        this.password = password;
//        return this;
//    }
//
//	public User name(String name) {
//		this.name = name;
//		return this;
//	}
//	
//	public User email(String email) {
//		this.email = email;
//		return this;
//	}


    //User.builder().username("haeseon").password("1234"); // 빌드패턴

}
