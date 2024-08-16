package org.Trip.DTO;

import org.Trip.domain.Criteria;

import lombok.Data;

@Data
public class PageDTO {
	
	private int startPage;
	private int endPage;
	private boolean prev, next;
	
	private int total;
	private Criteria cri;
	
	public PageDTO(Criteria cri, int total) {
		
		this.cri = cri;
		this.total = total;
		
		//1~10까지 1페이지, 11~20까지 2페이지...
		this.endPage = (int) (Math.ceil(cri.getPageNum() / 10.0)) * 10;
		
		//위에서 나온값의 9를 뺀다
		this.startPage = this.endPage - 9;
		
		// total은 전체 데이터 수
		int readEnd = (int) (Math.ceil((total * 1.0) / cri.getAmount()));
		
		if(readEnd < this.endPage) {
			
			this.endPage = readEnd;
			
		}
		
		this.prev = this.startPage > 1;
		
		this.next = this.endPage < readEnd;
	}

}
