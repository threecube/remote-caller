/**
 * 
 */
package com.threecube.test.rmi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author dingwenbin
 *
 */
public class RmiServiceStarter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			System.out.println("rmi服务端启动");
	        new ClassPathXmlApplicationContext("spring/applicationContext-rmi.xml");
	        System.out.println("rmi已成功启动");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
