package j18_generic;
import j17_최상위클래스.repository.user.User;

@Getter
public class Signin {
    private User dbUser;

    public Signin(){
        dbUser=User.builder() // user안에 builder 있으ㅡㅁ
        .username("haeseon")
        .password("1234")
        .email("1234@naver.com")
        .build();
    }
    // private String username="haeseon";
    // private String password="1234";

    // public Message<Integer,User> sendSigninMessage(boolean flag){
    public Message<Integer,? extends User> sendSigninMessage(boolean flag){// 와일드 카드 ? 로해서 타입 확정안함 
        if(flag==true){
            Message<Integer,User> message = new Message<Integer,User>();
            message.setCode(200);
            message.setData(dbUser);
            return message;
        }else{
            Message<Integer,String> message = new Message<Integer,String>();
            message.setCode(400);
            message.setData("로그인 실패. \n 아이디와 비밀번호를 확인해주세요!");
            return message; // return String message랑 함수 return 타입 User랑 불일치 
        }
    }
    
}
