package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SaishileixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SaishileixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SaishileixingView;


/**
 * 赛事类型
 *
 * @author 
 * @email 
 * @date 2021-04-12 10:10:08
 */
public interface SaishileixingService extends IService<SaishileixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SaishileixingVO> selectListVO(Wrapper<SaishileixingEntity> wrapper);
   	
   	SaishileixingVO selectVO(@Param("ew") Wrapper<SaishileixingEntity> wrapper);
   	
   	List<SaishileixingView> selectListView(Wrapper<SaishileixingEntity> wrapper);
   	
   	SaishileixingView selectView(@Param("ew") Wrapper<SaishileixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SaishileixingEntity> wrapper);
   	
}

