package j21_database.controller;

import java.util.ArrayList;
import java.util.HashMap;

import db.DBConnectionMgr;
import j21_database.dao.UserDao;
import j21_database.dto.User;
import j21_database.dto.UserDtl;
import j21_database.dto.UserMst;

public class DBMain {
	public static void main(String[] args) {
		UserDao userDao = new UserDao(DBConnectionMgr.getInstance()); 
		//UseDao userDao = new UserDao(new DBConnectionMgr()); 
		// 생성 시 에러 > DB~Mgr이 private으로 싱글톤 > static 메소드 (getInstance) 호출 
		// 해당 코드로 DBConnectionMgr의 pool 객체 사용 가능 
		
		// userMst 출력 
		ArrayList<UserMst> userMstList = userDao.getUserMstAll(); // db 접근
		for(UserMst um:userMstList) { // for each ; userMstList에서 하나씩 변수 um으로 빼면서 for문
			System.out.println(um);
		}
		
		// userDtl 출력 
		ArrayList<UserDtl> userDtlList = userDao.getUserDtlAll();
		for(UserDtl ud:userDtlList) {
			System.out.println(ud);
		}
		
		System.out.println(userDao.getUserByUsername("NCT"));
		
		// 키 값 넣어서 찾기 > 변수 userMst에 저장 > 다운캐스팅 
		HashMap<String,User> userMap = userDao.getUserByUsername("NCT");
		
//		if (userMap.get("um") instanceof UserMst) {
//			UserMst user = (UserMst)userMap.get("um");
//		}
		
		UserMst usermst = (UserMst)userMap.get("um");
		System.out.println(usermst.getName());
//		System.out.println(usermst);
		
		/*
		 * 로그인 구현 ( 좋은 방법은 아니고 쿼리 공부용 )
		 * 
		 * DAO -> User signin (String username, String password)
		 * 
		 * 비밀 번호 체크 
		 * select count(um.username) + count(um2.username) as [signin_flag]
		 * from user_mst um
		 * LEFT OUTER JOIN user_mst um2 ON (um2.usercode = um.usercode AND um2.password='?')
		 * where um.username = '?';
		 * 순서 Password가 1번이고 username이 2
		 * 
		 * count; 해당 row 에 결과값의 갯수 확인 
		 * 10 비번 틀린 거 00 아이디 틀린 거 11 로그인 성공 
		 * 
		 * signin_flag 2 로그인 성공 1 비밀번호 틀림 0 아이디 틀림 
		 *  > 로그인 성공 했을 때 UserDtl UserMst 객체 출
		 */

		
	}

}
