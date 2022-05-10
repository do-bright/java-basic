package j21_database.dto;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDtl extends User{ // 1. UserDtl 생성 2.User 상속 받게 
	private int usercode;
	private String phone;
	private String address;
	private int gender;
	private LocalDateTime create_date;
	private LocalDateTime update_date;

}
