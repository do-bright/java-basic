package j19_collection; 
import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args){
        ArrayList<String> strList = new ArrayList<String>(); 
        // arraylist 는 클래스라서 생성을 해야함 
        strList.add ("가"); 
        strList.add ("가"); 
        strList.add ("가"); 
        strList.add ("가"); 
        strList.add ("가"); 
        strList.add ("가"); 
        
        System.out.println("size : "+strList.size());
        System.out.println(strList);
    }
    
}
