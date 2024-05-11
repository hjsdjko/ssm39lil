package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QiuyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QiuyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QiuyuanView;


/**
 * 球员
 *
 * @author 
 * @email 
 * @date 2021-04-12 10:10:08
 */
public interface QiuyuanService extends IService<QiuyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QiuyuanVO> selectListVO(Wrapper<QiuyuanEntity> wrapper);
   	
   	QiuyuanVO selectVO(@Param("ew") Wrapper<QiuyuanEntity> wrapper);
   	
   	List<QiuyuanView> selectListView(Wrapper<QiuyuanEntity> wrapper);
   	
   	QiuyuanView selectView(@Param("ew") Wrapper<QiuyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QiuyuanEntity> wrapper);
   	
}

