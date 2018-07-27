/**
 * 
 */
package com.threecube.test.service.impl;

import java.util.Arrays;
import java.util.List;

import com.threecube.test.model.NetPointModel;
import com.threecube.test.model.RemoteResponse;
import com.threecube.test.service.NetPointService;

/**
 * @author dingwenbin
 *
 */
public class NetPointServiceImpl implements NetPointService {
	
	/* (non-Javadoc)
	 * @see com.threecube.test.rmi.service.NetPointService#getNetPointList()
	 */
	@Override
	public RemoteResponse<List<NetPointModel>> getNetPointList() {
		
		RemoteResponse<List<NetPointModel>> response = new RemoteResponse<List<NetPointModel>>();
		
		try {
			
			//TODO
			NetPointModel model = new NetPointModel();
			model.setBelongCorp("googleCorp");
			model.setHealthScore(20.5);
			model.setId(100);
			model.setPageDayViews(30000);
			model.setType("M");
			model.setUrl("www.google.com");
			
			response.setData(Arrays.asList(model));
			response.setCode(200);
			response.setSuccess(true);
		} catch (Exception e) {
			
			response.setCode(1001);
			response.setSuccess(false);
		}
		
		return response;
	}

	/* (non-Javadoc)
	 * @see com.threecube.test.rmi.service.NetPointService#saveNetPoint(java.util.List)
	 */
	@Override
	public RemoteResponse<List<Integer>> saveNetPoint(List<NetPointModel> netPointList) {
		
		RemoteResponse<List<Integer>> response = new RemoteResponse<List<Integer>>();
		
		response.setCode(200);
		response.setSuccess(true);
		response.setData(Arrays.asList(100,2001));
		return response;
	}

}
