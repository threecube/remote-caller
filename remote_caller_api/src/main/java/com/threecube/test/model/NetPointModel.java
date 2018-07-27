/**
 * 
 */
package com.threecube.test.model;

import java.io.Serializable;

/**
 * 网络站点模型
 * 
 * @author dingwenbin
 *ss
 */
public class NetPointModel implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8993448333451109791L;

	/**
	 * id
	 */
	private int id;
	
	/**
	 * 
	 */
	private String url; 

	/**
	 * 站点类型
	 */
	private String type;
	
	/**
	 * 所属公司
	 */
	private String belongCorp;
	
	/**
	 * 日访访问量
	 */
	private Integer pageDayViews;
	
	/**
	 * 健康度
	 */
	private Double healthScore;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the belongCorp
	 */
	public String getBelongCorp() {
		return belongCorp;
	}

	/**
	 * @param belongCorp the belongCorp to set
	 */
	public void setBelongCorp(String belongCorp) {
		this.belongCorp = belongCorp;
	}

	/**
	 * @return the pageDayViews
	 */
	public Integer getPageDayViews() {
		return pageDayViews;
	}

	/**
	 * @param pageDayViews the pageDayViews to set
	 */
	public void setPageDayViews(Integer pageDayViews) {
		this.pageDayViews = pageDayViews;
	}

	/**
	 * @return the healthScore
	 */
	public Double getHealthScore() {
		return healthScore;
	}

	/**
	 * @param healthScore the healthScore to set
	 */
	public void setHealthScore(Double healthScore) {
		this.healthScore = healthScore;
	}
	
	public String toString() {
		
		return String.format("id=%s, url=%s, type=%s, belongCorp=%s, pageDayViews=%s, healthScore=%s", 
				this.id, this.url, this.type, this.belongCorp, this.pageDayViews, this.healthScore);
	}
}
