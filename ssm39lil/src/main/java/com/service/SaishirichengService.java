package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SaishirichengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SaishirichengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SaishirichengView;


/**
 * 赛事日程
 *
 * @author 
 * @email 
 * @date 2021-04-12 10:10:08
 */
public interface SaishirichengService extends IService<SaishirichengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SaishirichengVO> selectListVO(Wrapper<SaishirichengEntity> wrapper);
   	
   	SaishirichengVO selectVO(@Param("ew") Wrapper<SaishirichengEntity> wrapper);
   	
   	List<SaishirichengView> selectListView(Wrapper<SaishirichengEntity> wrapper);
   	
   	SaishirichengView selectView(@Param("ew") Wrapper<SaishirichengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SaishirichengEntity> wrapper);
   	
}

