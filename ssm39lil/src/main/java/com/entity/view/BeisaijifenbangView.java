package com.entity.view;

import com.entity.BeisaijifenbangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 杯赛积分榜
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-12 10:10:08
 */
@TableName("beisaijifenbang")
public class BeisaijifenbangView  extends BeisaijifenbangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BeisaijifenbangView(){
	}
 
 	public BeisaijifenbangView(BeisaijifenbangEntity beisaijifenbangEntity){
 	try {
			BeanUtils.copyProperties(this, beisaijifenbangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
