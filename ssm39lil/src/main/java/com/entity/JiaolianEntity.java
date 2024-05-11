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
 * 教练
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-12 10:10:08
 */
@TableName("jiaolian")
public class JiaolianEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiaolianEntity() {
		
	}
	
	public JiaolianEntity(T t) {
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
	 * 俱乐部名称
	 */
					
	private String julebumingcheng;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date ruzhiriqi;
	
	/**
	 * 教练照片
	 */
					
	private String jiaolianzhaopian;
	
	
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
	 * 设置：俱乐部名称
	 */
	public void setJulebumingcheng(String julebumingcheng) {
		this.julebumingcheng = julebumingcheng;
	}
	/**
	 * 获取：俱乐部名称
	 */
	public String getJulebumingcheng() {
		return julebumingcheng;
	}
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
