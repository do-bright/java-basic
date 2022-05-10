package j21_database.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.util.ArrayList;
import java.util.HashMap;

import db.DBConnectionMgr;
import j21_database.dto.User;
import j21_database.dto.UserDtl;
import j21_database.dto.UserMst;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserDao {
	private final DBConnectionMgr pool;
	
	public ArrayList<UserMst> getUserMstAll(){
		String sql = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<UserMst> userMstList = new ArrayList<UserMst>(); 
		// db에서 select 한 걸 여기에 저장 
		// 한 줄 한 줄을 UserMst객체로 생성하면서 userMstList에다가 add(저장) 시킬 거임 
		// 그럼 userMstList에 모든 정보가 들어가 있겠지 ? 이걸(전체 리스트를) return 해줄 거임 
		// 한 명 한 명을 객체화해서 배열에 저장할 거다 그래서 그 전체 저장된 배열을 RETURN 할거다
		
		/**
		 * Dao 만들 때 (DB 연결 때) 필요한 것들 ; 
		 * 1) Return 되어질 값에 대한 객체 1 ex. ArrayList<UserMst> String ... 
		 * 2) sql 변수 ; 쿼리문 
		 * 3) con 객체 ; db 연결
		 * 4) PreparedStatement 변수 ; 
		 * 5) ResultSet 변수 ;
		 * 3 4 5는 순서대로 코드 작성함  
		 */
		
		// con = pool.getConnection(); 
		// getConnection ; 예외 처리 미뤄나서 무조건 surround with try catch ( 대여할 DB를 다른 사람들이 다 썼으면 객체가 생성이 안 될 수 있기 때문 )
		
		try {
			con = pool.getConnection();
			sql = "select * from user_mst";
			pstmt = con.prepareStatement(sql); // 쿼리문을 매개변수로 전달하면 pstmt로 생성을 해 줌 
			rs = pstmt.executeQuery(); // executeQuery(); 쿼리문이 실행이 됌 동기화 resultset 객체를 return 함 = 변수 rs에 담음 
			
			// rs 에 담은 결과를 다음과 같이 가져옴 
			while (rs.next()) { // 다음으로 넘겨줌
				// 테이블 내에서 돌면 하나씩 출력 ! 
//				System.out.println(rs.getInt(1)); // 보통 usercode(idx) 가 들어가 있음 
//				System.out.println(rs.getString(2)); // 이메일
//				System.out.println(rs.getString(3)); // 이름
//				System.out.println(rs.getString(4)); // 비번
//				// 없으면 반복문 빠져나옴 
				
				UserMst um = UserMst.builder()
						.usercode(rs.getInt(1))
						.email(rs.getString(2))
						.name(rs.getString(3))
						.username(rs.getNString(4))
						.password(rs.getString(5))
						.create_date(rs.getTimestamp(6).toLocalDateTime()) 
						// localdatetime 가져올 땐 getTimestamp > localdatetime 으로 !
						.update_date(rs.getTimestamp(7).toLocalDateTime())
						.build();
				// UserMst 객체 생성함 
				
				userMstList.add(um); // arraylist 에 담기 
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally { // 대여한 거 반납도 해줘야함 finally ; try / catch 각각 끝나고 모두 실행 
			pool.freeConnection(con, pstmt, rs);
		}
		
	
		return userMstList;
	}; // 배열로 전체 데이터 가져옴 
	
	public ArrayList<UserDtl> getUserDtlAll(){
		String sql = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<UserDtl> userDtlList = new ArrayList<UserDtl>(); 
		
		try {
			con = pool.getConnection();
			sql = "select * from user_dtl";
//			sql = "select * from user_dtl ud LEFT OUTER JOIN user_mst um ON(ud.usercode = um.usercode) ";
			pstmt = con.prepareStatement(sql); 
			rs = pstmt.executeQuery(); 
			
			while (rs.next()) { // 다음으로 넘겨줌
				UserDtl ud = UserDtl.builder()
						.usercode(rs.getInt(1))
						.address(rs.getString(2))
						.phone(rs.getString(3))
						.gender(rs.getInt(4))
						.create_date(rs.getTimestamp(5).toLocalDateTime()) 
						.update_date(rs.getTimestamp(6).toLocalDateTime())
						.build();				
				userDtlList.add(ud); 
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			pool.freeConnection(con,pstmt,rs);
		}
		return userDtlList;
		
	}
	
	// 이름으로 user찾기 (원래라면 userId 로 찾는 거 ) (loadUserByUsername)
	public HashMap<String, User> getUserByUsername(String username) {
		String sql = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<User> user = new ArrayList<User>(); // 묶는 방법 1.
		HashMap<String, User> userMap = new HashMap<String,User>();// 묶는 방법 2.
		
		
		try {
			con = pool.getConnection();
			sql = "select * from user_mst um "
					+ "LEFT OUTER JOIN user_dtl ud ON(ud.usercode = um.usercode) "
					+ "WHERE um.username = ?"; // 변수를 물음표로 두
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,username); // 물음표의 위치 (두개 이상일 때 구분하기  위함) , 넣을 변수  
			rs= pstmt.executeQuery();
			
	
			// 없는 username으로 찾으려고 할 때 데이터 없다고 알려줘야 함  
			try {
				rs.next();
				// try ; 이거 했을 때 예외 일어날 수 있다 
				// username으로 user 찾으면 usermst랑 userdtl 객체 생성해줘야 함  
				UserMst um = UserMst.builder()
						.usercode(rs.getInt(1))
						.email(rs.getString(2))
						.name(rs.getString(3))
						.username(rs.getNString(4))
						.password(rs.getString(5))
						.create_date(rs.getTimestamp(6).toLocalDateTime()) 
						.update_date(rs.getTimestamp(7).toLocalDateTime())
						.build();
				
				UserDtl ud = UserDtl.builder()
						.usercode(rs.getInt(8))
						.address(rs.getString(9))
						.phone(rs.getString(10))
						.gender(rs.getInt(11))
						.create_date(rs.getTimestamp(12).toLocalDateTime()) 
						.update_date(rs.getTimestamp(13).toLocalDateTime())
						.build();
				// 이제 userMst랑 userDtl 를 묶어서 두개를 하나(User)로 가져야 함 
				
				// 묶는 방법 1. 리스트 (어디에 뭐가 들어 있는지 직접 꺼내서 봐야함)
				user.add(um);
				user.add(ud);
				// 묶는 방법 2. 맵 (리스트 보다 좀 더 직관적)
				userMap.put("um", um);
				userMap.put("ud", ud);
				// 묶는 방법 3. user객체 (dto-User.java)에 담음 
				
			}catch(SQLDataException e) { // SQLDataException = data가 없을 때 !! 
				System.out.println("해당 username으로 데이터를 찾을 수 없습니다. ");
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println(rs.getInt(1)); // 테스트 
			
			
		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			pool.freeConnection(con,pstmt,rs);
		}

		
		return userMap;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
