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
 * 杯赛积分榜
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-12 10:10:08
 */
@TableName("beisaijifenbang")
public class BeisaijifenbangEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public BeisaijifenbangEntity() {
		
	}
	
	public BeisaijifenbangEntity(T t) {
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
	 * 球队
	 */
					
	private String qiudui;
	
	/**
	 * 场次
	 */
					
	private String changci;
	
	/**
	 * 胜
	 */
					
	private Integer sheng;
	
	/**
	 * 平
	 */
					
	private Integer ping;
	
	/**
	 * 负
	 */
					
	private Integer fu;
	
	/**
	 * 进球
	 */
					
	private Integer jinqiu;
	
	/**
	 * 失球
	 */
					
	private Integer shiqiu;
	
	/**
	 * 净失球
	 */
					
	private Integer jingshiqiu;
	
	/**
	 * 积分
	 */
					
	private Integer jifen;
	
	/**
	 * 球队照片
	 */
					
	private String qiuduizhaopian;
	
	
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
	 * 设置：球队
	 */
	public void setQiudui(String qiudui) {
		this.qiudui = qiudui;
	}
	/**
	 * 获取：球队
	 */
	public String getQiudui() {
		return qiudui;
	}
	/**
	 * 设置：场次
	 */
	public void setChangci(String changci) {
		this.changci = changci;
	}
	/**
	 * 获取：场次
	 */
	public String getChangci() {
		return changci;
	}
	/**
	 * 设置：胜
	 */
	public void setSheng(Integer sheng) {
		this.sheng = sheng;
	}
	/**
	 * 获取：胜
	 */
	public Integer getSheng() {
		return sheng;
	}
	/**
	 * 设置：平
	 */
	public void setPing(Integer ping) {
		this.ping = ping;
	}
	/**
	 * 获取：平
	 */
	public Integer getPing() {
		return ping;
	}
	/**
	 * 设置：负
	 */
	public void setFu(Integer fu) {
		this.fu = fu;
	}
	/**
	 * 获取：负
	 */
	public Integer getFu() {
		return fu;
	}
	/**
	 * 设置：进球
	 */
	public void setJinqiu(Integer jinqiu) {
		this.jinqiu = jinqiu;
	}
	/**
	 * 获取：进球
	 */
	public Integer getJinqiu() {
		return jinqiu;
	}
	/**
	 * 设置：失球
	 */
	public void setShiqiu(Integer shiqiu) {
		this.shiqiu = shiqiu;
	}
	/**
	 * 获取：失球
	 */
	public Integer getShiqiu() {
		return shiqiu;
	}
	/**
	 * 设置：净失球
	 */
	public void setJingshiqiu(Integer jingshiqiu) {
		this.jingshiqiu = jingshiqiu;
	}
	/**
	 * 获取：净失球
	 */
	public Integer getJingshiqiu() {
		return jingshiqiu;
	}
	/**
	 * 设置：积分
	 */
	public void setJifen(Integer jifen) {
		this.jifen = jifen;
	}
	/**
	 * 获取：积分
	 */
	public Integer getJifen() {
		return jifen;
	}
	/**
	 * 设置：球队照片
	 */
	public void setQiuduizhaopian(String qiuduizhaopian) {
		this.qiuduizhaopian = qiuduizhaopian;
	}
	/**
	 * 获取：球队照片
	 */
	public String getQiuduizhaopian() {
		return qiuduizhaopian;
	}

}
