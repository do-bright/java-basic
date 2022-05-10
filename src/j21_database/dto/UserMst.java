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
public class UserMst extends User{ // 1. UserMst 생성 2.User 상속 받게 
	private int usercode;
	private String email;
	private String name;
	private String username;
	private String password;
	private LocalDateTime create_date;
	private LocalDateTime update_date;
}


