/**
 * 
 */
package com.threecube.test.model;

import java.io.Serializable;

/**
 * @author dingwenbin
 *
 */
public class RemoteResponse<T> implements Serializable {
	
	private static final long serialVersionUID = 7322463893556018143L;

	/**
	 * 是否成功
	 */
	private boolean isSuccess;
	
	/**
	 * 错误码， 正确的为200
	 */
	private Integer code;
	
	/**
	 * 错误信息
	 */
	private String errMsg; 
	
	/**
	 * 数据
	 */
	private T data;

	/**
	 * @return the isSuccess
	 */
	public boolean isSuccess() {
		return isSuccess;
	}

	/**
	 * @param isSuccess the isSuccess to set
	 */
	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	/**
	 * @return the code
	 */
	public Integer getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(Integer code) {
		this.code = code;
	}

	/**
	 * @return the errMsg
	 */
	public String getErrMsg() {
		return errMsg;
	}

	/**
	 * @param errMsg the errMsg to set
	 */
	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	/**
	 * @return the data
	 */
	public T getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(T data) {
		this.data = data;
	}
	
	
}
