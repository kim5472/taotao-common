package com.taotao.common.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * 网络传输
 * 因为EasyUI数据格式要求为
 * {total:"2",rows:[{"id":"1","name":"zhangsan"},{...}]}
 * 所以设计时候要遵守一定的规则
 * @author Administrator
 * @param <T>
 *
 */
public class EasyUIDataGrifResult implements Serializable{

	private long total;
	private List rows;
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List getRows() {
		return rows;
	}
	public void setRows(List rows) {
		this.rows = rows;
	}
	@Override
	public String toString() {
		return "EasyUIDataGrifResult [total=" + total + ", rows=" + rows + "]";
	}
	
}
