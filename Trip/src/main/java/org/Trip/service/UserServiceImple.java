package org.Trip.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.Trip.domain.TripUserVO;
import org.Trip.domain.Criteria;
import org.Trip.mapper.UserMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import lombok.Setter;


@Log4j
@Service
@AllArgsConstructor
public class UserServiceImple implements UserService {
	
	//해당 인터페이스 필드에 의존
	@Setter(onMethod_ =@Autowired)
	private UserMapper mapper;
	
	@Override
	public boolean idCheck(String checkId) {
		
		TripUserVO user = mapper.findId(checkId);
		
		return user != null;
	}
	
	@Override
	public void join(TripUserVO user) {
		
		log.info("환영합니다" + user);
		
		mapper.insertSelectKey(user);
		
//		mapper.insert(user);
	}
	
	
	@Override
	public TripUserVO get(Long uno) {
		
		log.info("해당 유저:" + uno);
		
		return mapper.read(uno);
	}
	
	
	
	
	@Override
	public boolean remove(Long uno) {
		
		log.info("탈퇴 및 삭제할 유저:" + uno);
		
		return mapper.delete(uno) == 1;
		
	}
	
	@Override
	public List<TripUserVO> userList(Criteria cri) {
		
		log.info("get List with criteria: " + cri);
		
		return mapper.getListWithPaging(cri);
	}
	
	
	@Override
	public int getTotal(Criteria cri) {
		
		log.info("get total count");
		return mapper.getTotalCount(cri);
	}
	
	
	@Override
	public List<TripUserVO> findAll() {
		
		log.info("현재 유저 정보");
		
		return mapper.getList();
	}

}
