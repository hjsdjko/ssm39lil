package com.entity.view;

import com.entity.QiuyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 球员
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-12 10:10:08
 */
@TableName("qiuyuan")
public class QiuyuanView  extends QiuyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QiuyuanView(){
	}
 
 	public QiuyuanView(QiuyuanEntity qiuyuanEntity){
 	try {
			BeanUtils.copyProperties(this, qiuyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
