package com.common;

import lombok.Data;

/**
 * 用于返回json 数据
 * @author mrt
 *
 */
@Data
public class ResultObj {
	public ResultObj(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	//业务响应码
	private int code ;
	//业务消息
	private String msg;
}
