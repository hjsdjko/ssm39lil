package com.entity.model;

import com.entity.SaishirichengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 赛事日程
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-12 10:10:08
 */
public class SaishirichengModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 比赛日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date bisairiqi;
		
	/**
	 * 开始时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date kaishishijian;
		
	/**
	 * 结束时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jieshushijian;
		
	/**
	 * 轮次
	 */
	
	private String lunci;
		
	/**
	 * 状态
	 */
	
	private String zhuangtai;
		
	/**
	 * 主队
	 */
	
	private String zhudui;
		
	/**
	 * 客队
	 */
	
	private String kedui;
		
	/**
	 * 赛况
	 */
	
	private String saikuang;
		
	/**
	 * 照片
	 */
	
	private String zhaopian;
				
	
	/**
	 * 设置：比赛日期
	 */
	 
	public void setBisairiqi(Date bisairiqi) {
		this.bisairiqi = bisairiqi;
	}
	
	/**
	 * 获取：比赛日期
	 */
	public Date getBisairiqi() {
		return bisairiqi;
	}
				
	
	/**
	 * 设置：开始时间
	 */
	 
	public void setKaishishijian(Date kaishishijian) {
		this.kaishishijian = kaishishijian;
	}
	
	/**
	 * 获取：开始时间
	 */
	public Date getKaishishijian() {
		return kaishishijian;
	}
				
	
	/**
	 * 设置：结束时间
	 */
	 
	public void setJieshushijian(Date jieshushijian) {
		this.jieshushijian = jieshushijian;
	}
	
	/**
	 * 获取：结束时间
	 */
	public Date getJieshushijian() {
		return jieshushijian;
	}
				
	
	/**
	 * 设置：轮次
	 */
	 
	public void setLunci(String lunci) {
		this.lunci = lunci;
	}
	
	/**
	 * 获取：轮次
	 */
	public String getLunci() {
		return lunci;
	}
				
	
	/**
	 * 设置：状态
	 */
	 
	public void setZhuangtai(String zhuangtai) {
		this.zhuangtai = zhuangtai;
	}
	
	/**
	 * 获取：状态
	 */
	public String getZhuangtai() {
		return zhuangtai;
	}
				
	
	/**
	 * 设置：主队
	 */
	 
	public void setZhudui(String zhudui) {
		this.zhudui = zhudui;
	}
	
	/**
	 * 获取：主队
	 */
	public String getZhudui() {
		return zhudui;
	}
				
	
	/**
	 * 设置：客队
	 */
	 
	public void setKedui(String kedui) {
		this.kedui = kedui;
	}
	
	/**
	 * 获取：客队
	 */
	public String getKedui() {
		return kedui;
	}
				
	
	/**
	 * 设置：赛况
	 */
	 
	public void setSaikuang(String saikuang) {
		this.saikuang = saikuang;
	}
	
	/**
	 * 获取：赛况
	 */
	public String getSaikuang() {
		return saikuang;
	}
				
	
	/**
	 * 设置：照片
	 */
	 
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}
			
}
