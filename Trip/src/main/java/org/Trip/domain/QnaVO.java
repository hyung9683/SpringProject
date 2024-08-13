package org.Trip.domain;

import java.util.Date;

import lombok.Data;

@Data
public class QnaVO {
	
	private Long qno;
	private Long uno;
	private String title;
	private String content;
	private int count;
	private String answer;
	private Date regdate;
	private int secret;

}
