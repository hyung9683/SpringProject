package org.Trip.domain;

import java.util.Date;

import lombok.Data;

@Data
public class ReviewVO {
	
	private Long rno;
	private int best;
	private String title;
	private String content;
	private Long uno;
	private String userId;
	private Long tno;
	private Long fno;
	private Date regdate;

}
