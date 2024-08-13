package org.Trip.domain;

import java.util.Date;

import lombok.Data;

@Data
public class FestivalVO {
	
	private Long fno;
	private String title;
	private String address;
	private String content;
	private String local;
	private Long localId;
	private Date regdate;
	private String price;
	private int count;
	

}
