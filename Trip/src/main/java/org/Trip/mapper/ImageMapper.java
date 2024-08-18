package org.Trip.mapper;

import java.util.List;

import org.Trip.domain.ImageFileVO;

public interface ImageMapper {
	
	public List<ImageFileVO> getList();
	
	
	//trip 또는 fes 테이블이랑 같이 쓴다.
	public int insertImg(ImageFileVO img);
	
	public int deleteImg(Long ino);
	
	public int updateImg(ImageFileVO img);
	
	

}
