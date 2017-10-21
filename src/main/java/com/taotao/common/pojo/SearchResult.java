package com.taotao.common.pojo;

import java.io.Serializable;
import java.util.List;

public class SearchResult implements Serializable{
	private List<SearchItem> itemList;
	private long recordCount;
	private long totalPages;
	public List<SearchItem> getItemList() {
		return itemList;
	}
	public void setItemList(List<SearchItem> itemList) {
		this.itemList = itemList;
	}
	public long getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(long totalPages) {
		this.totalPages = totalPages;
	}
	
	public long getRecordCount() {
		return recordCount;
	}
	public void setRecordCount(long recordCount) {
		this.recordCount = recordCount;
	}
	@Override
	public String toString() {
		return "SearchResult [itemList=" + itemList + ", recordCount=" + recordCount + ", totalPages=" + totalPages
				+ "]";
	}
	
}
