package org.Trip.domain;

import java.util.Date;

import lombok.Data;

@Data
public class BoardVO {
	
	private Long bno;
	private Long uno;
	private String title;
	private String content;
	private int count;
	private Date regdate;
	private String answer;

}
