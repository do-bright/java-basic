package j17_최상위클래스.repository;
import j17_최상위클래스.repository.user.User;

public class UserArray {

    private User[] userArray;
    // private int index=0; 있는 공간 만큼 쓸 때 사용

    public UserArray(int arraySize){
        userArray = new User[arraySize];
    }

    public UserArray(){
        userArray = new User[0];
        
    }


    // 값을 늘리려면 ? 배열을 새로 생성해야 함 (현재 보다 +1 한 크기만큼의 공간을 갖고있는)

    /**
     * 크기 늘려주기 위한 메소드
    */ 
    private void userArraySizeUp(){ // 내부에서만 사이즈업 가능해야함 -> private
        User[] tempuserArray = new User[userArray.length+1];

        // tempuserArray에 있는 걸 userArray 로 옮기기
        // 마지막 꺼 빼고 데이터 다 옮겨짐 
        for(int i=0; i<userArray.length; i++){
            tempuserArray[i] = userArray[i];
        }
        userArray = tempuserArray; // 한공간도 늘려나면서 + 데이터도 다 옮겨짐 // 여기서 공간 늘어남 !
        // 지금은 옮겼고, 한 공간까지 늘어났지만 젤 마지막 데이터는 아직 못 옮긴 상황
    }

    /**
     * 추가 메인 메소드 
    */ 
    public void add(User user){
        userArraySizeUp();
        userArray[userArray.length-1] = user; // index 라 길이-1 ! // 마지막 값 데이터 옮기기 ! 여기서 최종적으로 데이터가 다 옮겨짐

        // userArray[index]=user; 있는 공간 만큼 쓸 때 사용
        // index++; 있는 공간 만큼 쓸 때 사용
    }

    public User[] getuserArray(){
        return userArray;
    }


    
}
