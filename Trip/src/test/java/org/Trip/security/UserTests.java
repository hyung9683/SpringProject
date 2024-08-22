package org.Trip.security;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/root-context.xml", "file:src/main/webapp/WEB-INF/spring/security-context.xml"})
@Log4j
public class UserTests {
	
	@Setter(onMethod_ =@Autowired)
	private PasswordEncoder pwencoder;
	
	@Setter(onMethod_ =@Autowired)
	private DataSource ds;
	
//	
//	@Test
//	public void testInsertMember() {
		
//		String sql = "insert into userMember(uno, user_id, user_pw, user_nick) values(seq_mem.nextval, ?, ?, ?)";
//		String sql = "insert into userTable(uno, user_id, user_pw, user_nick) values(seq_user.nextval, ?, ?, ?)";
//	
//		
//		// 100명의 회원 정보를 기록
//		for(int i = 0; i < 100; i++) {
//			
//			Connection con = null;
//			
//			PreparedStatement pstmt = null;
//			
//			try {
//				
//				con = ds.getConnection();
//				pstmt = con.prepareStatement(sql);
//				
//				// 2번째 열은 암호화 된 문자열
//				pstmt.setString(2, pwencoder.encode("pw" + i));
//				
//				
//				if(i < 80) {
//					
//					// 첫번째 열은 아이디
//					pstmt.setString(1, "user" + i);
//					
//					// 3번째 열은 닉네임
//					pstmt.setString(3, "일반사용자" + i);
//				} else if(i < 90) {
//					
//					pstmt.setString(1, "manager" + i);
//					pstmt.setString(3, "운영자" + i);
//					
//				} else {
//					
//					pstmt.setString(1, "admin" + i);
//					pstmt.setString(3, "관리자" + i);
//				}
//				
//				pstmt.executeUpdate();
//			} catch (Exception e) {
//				
//				e.printStackTrace();
//			} finally {
//				
//				if(pstmt != null) {try {pstmt.close();} catch(Exception e) {}}
//				if(con != null) {try {con.close();} catch(Exception e) {}}
//			}
//		}// end for
//	}
	
	
	//권한 추가
	@Test
	public void testInsertAuth() {
		
		String sql = "insert into user_auth (user_id, auth) values (?, ?)";
		
		for (int i = 0; i < 100; i++) {
			
			Connection con = null;
			
			PreparedStatement pstmt = null;
			
			try {
				
				con = ds.getConnection();
				pstmt = con.prepareStatement(sql);
				
				if(i < 80) {
					
					pstmt.setString(1,  "user" + i);
					pstmt.setString(2, "ROLE_USER");
				} else if(i < 90) {
					
					pstmt.setString(1, "manager" + i);
					pstmt.setString(2, "ROLE_MEMBER");
				} else {
					
					pstmt.setString(1, "admin" + i);
					pstmt.setString(2, "ROLE_ADMIN");
					
				}
				
				pstmt.executeUpdate();
			}catch(Exception e) {
				
				e.printStackTrace();
			} finally {
				
				if(pstmt != null) {try {pstmt.close();} catch(Exception e) {}}
				if(con != null) {try {con.close();} catch(Exception e) {}}
			}
		} // end for
	}

}
