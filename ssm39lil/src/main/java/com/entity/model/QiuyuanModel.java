package com.entity.model;

import com.entity.QiuyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 球员
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-12 10:10:08
 */
public class QiuyuanModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 国家
	 */
	
	private String guojia;
		
	/**
	 * 球员姓名
	 */
	
	private String qiuyuanxingming;
		
	/**
	 * 球员位置
	 */
	
	private String qiuyuanweizhi;
		
	/**
	 * 球员身高
	 */
	
	private Integer qiuyuanshengao;
		
	/**
	 * 球员体重
	 */
	
	private Integer qiuyuantizhong;
		
	/**
	 * 球员球龄
	 */
	
	private Integer qiuyuanqiuling;
		
	/**
	 * 球员国籍
	 */
	
	private String qiuyuanguoji;
		
	/**
	 * 球员照片
	 */
	
	private String qiuyuanzhaopian;
				
	
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
	 * 设置：球员姓名
	 */
	 
	public void setQiuyuanxingming(String qiuyuanxingming) {
		this.qiuyuanxingming = qiuyuanxingming;
	}
	
	/**
	 * 获取：球员姓名
	 */
	public String getQiuyuanxingming() {
		return qiuyuanxingming;
	}
				
	
	/**
	 * 设置：球员位置
	 */
	 
	public void setQiuyuanweizhi(String qiuyuanweizhi) {
		this.qiuyuanweizhi = qiuyuanweizhi;
	}
	
	/**
	 * 获取：球员位置
	 */
	public String getQiuyuanweizhi() {
		return qiuyuanweizhi;
	}
				
	
	/**
	 * 设置：球员身高
	 */
	 
	public void setQiuyuanshengao(Integer qiuyuanshengao) {
		this.qiuyuanshengao = qiuyuanshengao;
	}
	
	/**
	 * 获取：球员身高
	 */
	public Integer getQiuyuanshengao() {
		return qiuyuanshengao;
	}
				
	
	/**
	 * 设置：球员体重
	 */
	 
	public void setQiuyuantizhong(Integer qiuyuantizhong) {
		this.qiuyuantizhong = qiuyuantizhong;
	}
	
	/**
	 * 获取：球员体重
	 */
	public Integer getQiuyuantizhong() {
		return qiuyuantizhong;
	}
				
	
	/**
	 * 设置：球员球龄
	 */
	 
	public void setQiuyuanqiuling(Integer qiuyuanqiuling) {
		this.qiuyuanqiuling = qiuyuanqiuling;
	}
	
	/**
	 * 获取：球员球龄
	 */
	public Integer getQiuyuanqiuling() {
		return qiuyuanqiuling;
	}
				
	
	/**
	 * 设置：球员国籍
	 */
	 
	public void setQiuyuanguoji(String qiuyuanguoji) {
		this.qiuyuanguoji = qiuyuanguoji;
	}
	
	/**
	 * 获取：球员国籍
	 */
	public String getQiuyuanguoji() {
		return qiuyuanguoji;
	}
				
	
	/**
	 * 设置：球员照片
	 */
	 
	public void setQiuyuanzhaopian(String qiuyuanzhaopian) {
		this.qiuyuanzhaopian = qiuyuanzhaopian;
	}
	
	/**
	 * 获取：球员照片
	 */
	public String getQiuyuanzhaopian() {
		return qiuyuanzhaopian;
	}
			
}
