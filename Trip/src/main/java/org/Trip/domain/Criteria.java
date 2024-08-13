package org.Trip.domain;

import lombok.Data;

@Data
public class Criteria {
	
	// 페이지 번호
	private int pageNum;
	// 표시할 게시글 수
	private int amount;
	
	private String type; // 제목, 카테고리별, 내용, 등등
	private String keyword;
	
	public Criteria() {
		
		this(1, 10);
	}
	
	public Criteria(int pageNum, int amount) {
		
		this.pageNum = pageNum;
		this.amount = amount;
	}
	
	public String[] getTypeArr() {
		
		return type == null ? new String[] {} : type.split("");
	}

}
