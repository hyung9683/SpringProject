package org.Trip.domain;

import java.util.Date;

import lombok.Data; 

@Data
public class BoardCommentsVO {
	
	private Long cno;
	private Long bno;
	private Long uno;
	private String content;
	private int parentId;
	private Date regdate;
	

}
