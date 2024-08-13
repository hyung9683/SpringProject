package org.Trip.service;

import java.util.List;

import org.Trip.domain.TripUserVO;
import org.Trip.domain.Criteria;

// 관리자에서만 쓰는 메서드도 있다

public interface UserService {
	
	// 회원가입
	public void join(TripUserVO user);
	
	// 해당 유저
	public TripUserVO get(Long uno);
	
	
// === 관리자 ====
	
	// 유저 삭제 (회원탈퇴랑 같이 씀)
	public boolean remove(Long uno);
	
	
	//회원 정보 리스트 페이징
	public List<TripUserVO> userList(Criteria cri);
	
	//총 회원수
	public int getTotal(Criteria cri);

}
