package org.Trip.domain;

import java.util.Date;

import lombok.Data;

@Data
public class ImageFileVO {
	
	private Long ino;
	private String main;
	private String sub1;
	private String sub2;
	private String sub3;
	private String sub4;
	private Long fno;
	private Long tno;
	private int localId;
	private Date regdate;
	private Date update;

}
