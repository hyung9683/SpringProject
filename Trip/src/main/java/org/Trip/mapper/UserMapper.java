package org.Trip.mapper;

import java.util.List;

//import org.apache.ibatis.annotations.Select;
import org.Trip.domain.TripUserVO;
import org.Trip.domain.Criteria;

public interface UserMapper {
	
	// 유저 전체 정보
	public List<TripUserVO> getList();
	
	public List<TripUserVO> getListWithPaging(Criteria cri);
	
	//아이디 중복 체크
	public TripUserVO findId(String userId);
	
	//회원가입
	public void insert(TripUserVO user);
	
	//pk를 명시적으로 보여주기 위해 시퀀스 번호를 더미 테이블에서 만든 뒤 갖고온다 
	public Integer insertSelectKey(TripUserVO user);
	
	// 로그인 하기 위해 유저 정보를 가져온다
	public TripUserVO read(Long uno);
	
	// 계정 삭제
	public int delete(Long uno);
	
	
	//현재 가입한 유저 수
	public int getTotalCount(Criteria cri);

}
