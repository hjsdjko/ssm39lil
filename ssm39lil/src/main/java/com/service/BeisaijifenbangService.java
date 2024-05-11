package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BeisaijifenbangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BeisaijifenbangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BeisaijifenbangView;


/**
 * 杯赛积分榜
 *
 * @author 
 * @email 
 * @date 2021-04-12 10:10:08
 */
public interface BeisaijifenbangService extends IService<BeisaijifenbangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BeisaijifenbangVO> selectListVO(Wrapper<BeisaijifenbangEntity> wrapper);
   	
   	BeisaijifenbangVO selectVO(@Param("ew") Wrapper<BeisaijifenbangEntity> wrapper);
   	
   	List<BeisaijifenbangView> selectListView(Wrapper<BeisaijifenbangEntity> wrapper);
   	
   	BeisaijifenbangView selectView(@Param("ew") Wrapper<BeisaijifenbangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BeisaijifenbangEntity> wrapper);
   	
}

