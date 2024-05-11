package com.entity.view;

import com.entity.ZuqiuzhoubianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 足球周边
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-12 10:10:08
 */
@TableName("zuqiuzhoubian")
public class ZuqiuzhoubianView  extends ZuqiuzhoubianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZuqiuzhoubianView(){
	}
 
 	public ZuqiuzhoubianView(ZuqiuzhoubianEntity zuqiuzhoubianEntity){
 	try {
			BeanUtils.copyProperties(this, zuqiuzhoubianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
