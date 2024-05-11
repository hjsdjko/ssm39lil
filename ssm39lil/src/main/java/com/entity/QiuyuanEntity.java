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
 * 球员
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-12 10:10:08
 */
@TableName("qiuyuan")
public class QiuyuanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public QiuyuanEntity() {
		
	}
	
	public QiuyuanEntity(T t) {
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
