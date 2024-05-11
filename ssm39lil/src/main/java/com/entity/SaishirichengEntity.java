package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 赛事日程
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-12 10:10:08
 */
@TableName("saishiricheng")
public class SaishirichengEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public SaishirichengEntity() {
		
	}
	
	public SaishirichengEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 赛事类型
	 */
					
	private String saishileixing;
	
	/**
	 * 比赛日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：赛事类型
	 */
	public void setSaishileixing(String saishileixing) {
		this.saishileixing = saishileixing;
	}
	/**
	 * 获取：赛事类型
	 */
	public String getSaishileixing() {
		return saishileixing;
	}
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
