package com.entity.model;

import com.entity.JiaolianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 教练
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-12 10:10:08
 */
public class JiaolianModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 国家
	 */
	
	private String guojia;
		
	/**
	 * 教练姓名
	 */
	
	private String jiaolianxingming;
		
	/**
	 * 教练国籍
	 */
	
	private String jiaolianguoji;
		
	/**
	 * 入职日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date ruzhiriqi;
		
	/**
	 * 教练照片
	 */
	
	private String jiaolianzhaopian;
				
	
	/**
	 * 设置：国家
	 */
	 
	public void setGuojia(String guojia) {
		this.guojia = guojia;
	}
	
	/**
	 * 获取：国家
	 */
	public String getGuojia() {
		return guojia;
	}
				
	
	/**
	 * 设置：教练姓名
	 */
	 
	public void setJiaolianxingming(String jiaolianxingming) {
		this.jiaolianxingming = jiaolianxingming;
	}
	
	/**
	 * 获取：教练姓名
	 */
	public String getJiaolianxingming() {
		return jiaolianxingming;
	}
				
	
	/**
	 * 设置：教练国籍
	 */
	 
	public void setJiaolianguoji(String jiaolianguoji) {
		this.jiaolianguoji = jiaolianguoji;
	}
	
	/**
	 * 获取：教练国籍
	 */
	public String getJiaolianguoji() {
		return jiaolianguoji;
	}
				
	
	/**
	 * 设置：入职日期
	 */
	 
	public void setRuzhiriqi(Date ruzhiriqi) {
		this.ruzhiriqi = ruzhiriqi;
	}
	
	/**
	 * 获取：入职日期
	 */
	public Date getRuzhiriqi() {
		return ruzhiriqi;
	}
				
	
	/**
	 * 设置：教练照片
	 */
	 
	public void setJiaolianzhaopian(String jiaolianzhaopian) {
		this.jiaolianzhaopian = jiaolianzhaopian;
	}
	
	/**
	 * 获取：教练照片
	 */
	public String getJiaolianzhaopian() {
		return jiaolianzhaopian;
	}
			
}
