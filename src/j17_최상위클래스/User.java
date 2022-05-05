package j17_최상위클래스;

import java.util.Objects;

public class User {
    private int usercode;
    private String username;
    private String password;
    private String name;
    private String email;

    public User(int usercode, String username, String password, String name, String email) {
        super();
        this.usercode = usercode;
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
    }

    public void setUsercode(int usercode) {
        this.usercode = usercode;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getUsercode() {
        return usercode;
    }
    
    public String getUsername() {
        return username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, name, password, usercode, username);
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj)  // 1. 주소가 같을 때 
            return true;
        if(obj==null) // 2. obj가 null 일때
            return false;
        if(getClass()!=obj.getClass()) // 3. 파일 자체가 틀리면 
            return false;
        // User other = (User) obj; // obj를 다운캐스팅 아래 주석한 return 과 같이 쓸 때 사용
        // return Object.equals(email,other.email) && Object.equals(name,other.name) 
        // && Object.equals(password,other.password) && usercode == other.usercode 
        // && Object.equals(username,other.username);
        
        // equals랑 hashcode는 항상 같이 움직임 아래 코드와 동일 
        return this.hashCode() == obj.hashCode();
    }

    // @Override
    // public boolean equals(Object obj) {
    //     boolean result = false;
    //     if (this.usercode == ((User) obj).usercode) {
    //         result = true;
    //     }
    //     return result;
    //     // obj 가 업캐스팅해서 들어옴 > 다운캐스팅 먼저 해주기 
    // }

    @Override
    public String toString() {
        return "User [usercode=" + usercode + ",username="+username+", password="+password+", name="+name+
                ", email=" + email + "]";
    }
}