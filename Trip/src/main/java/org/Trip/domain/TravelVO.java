package org.Trip.domain;

import java.util.Date;
import java.util.List;

import org.Trip.domain.ImageFileVO;

import lombok.Data;

@Data
public class TravelVO {
	
	private Long tno;
	private String title;
	private String address;
	private String content;
	private String local;
	private Long localId;
	private Long localCategory;
	private Date regdate;
	private Date updatedate;
	private String price;
	private int count;
	
	private List<ImageFileVO> imageList;
	

}
