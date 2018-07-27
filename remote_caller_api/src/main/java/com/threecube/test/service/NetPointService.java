/**
 * 
 */
package com.threecube.test.service;

import java.util.List;

import com.threecube.test.model.NetPointModel;
import com.threecube.test.model.RemoteResponse;

/**
 * @author dingwenbin
 *
 */
public interface NetPointService {

	/**
	 * 获取所有站点信息
	 * 
	 * @return
	 */
	RemoteResponse<List<NetPointModel>> getNetPointList();
	
	/**
	 * 保存站点信息
	 * 
	 * @param netPointList
	 * @return
	 */
	RemoteResponse<List<Integer>> saveNetPoint(List<NetPointModel> netPointList); 
}
