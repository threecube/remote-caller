/**
 * 
 */
package com.threecube.test.invoker;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.threecube.test.model.NetPointModel;
import com.threecube.test.model.RemoteResponse;
import com.threecube.test.service.NetPointService;

/**
 * @author dingwenbin
 *
 */
public class InvokerServiceClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("invoker调用开始");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/applicationContext-invoker.xml");
        NetPointService service =(NetPointService)ctx.getBean("netPointService");
        RemoteResponse<List<NetPointModel>> response = service.getNetPointList();
        
        if(!response.isSuccess()) {
        	System.out.println(response.toString());
        } else {
        	
        	for(NetPointModel point : response.getData()) {
        		System.out.println(point.toString());
        	}
        }
	}

}
