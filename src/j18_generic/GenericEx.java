package j18_generic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class GenericEx<T>{
    private T data; // <T> 파라미터 ; 뭘로 파라미터로 오냐에 따라 String, int 등 자료형 변화

    
}
