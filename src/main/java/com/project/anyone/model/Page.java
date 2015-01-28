package com.project.anyone.model;

public class Page {
	private int pageNo;
	private int totalCount;
	private int startRowNo;
	private int endRowNo;
	private int pageSize;
	private final int pagePerCount = 5;
	private final int pageBlock = 5;

	public void init() {
		this.startRowNo = pageNo <= 1 ? 0 : pagePerCount * (pageNo - 1);
		this.endRowNo = pagePerCount;
		this.pageSize = totalCount / 5;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPagePerCount() {
		return pagePerCount;
	}

	public int getPageBlock() {
		return pageBlock;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getStartRowNo() {
		return startRowNo;
	}

	public void setStartRowNo(int startRowNo) {
		this.startRowNo = startRowNo;
	}

	public int getEndRowNo() {
		return endRowNo;
	}

	public void setEndRowNo(int endRowNo) {
		this.endRowNo = endRowNo;
	}

}
