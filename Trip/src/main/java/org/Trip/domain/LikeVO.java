package org.Trip.domain;

import java.util.Date;

import lombok.Data;


@Data
public class LikeVO {
	
	private Long lno; // 좋아요 번호
	private Long uno; // 유저 번호
	private Long tno; // 여행 번호
	private Long fno; // 축제 번호
	private int category; // 좋아요 된 카테고리
	private int total; // 좋아요 총 수
	private Date regdate;

}
