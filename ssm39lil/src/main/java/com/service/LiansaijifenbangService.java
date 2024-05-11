package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LiansaijifenbangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LiansaijifenbangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LiansaijifenbangView;


/**
 * 联赛积分榜
 *
 * @author 
 * @email 
 * @date 2021-04-12 10:10:08
 */
public interface LiansaijifenbangService extends IService<LiansaijifenbangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LiansaijifenbangVO> selectListVO(Wrapper<LiansaijifenbangEntity> wrapper);
   	
   	LiansaijifenbangVO selectVO(@Param("ew") Wrapper<LiansaijifenbangEntity> wrapper);
   	
   	List<LiansaijifenbangView> selectListView(Wrapper<LiansaijifenbangEntity> wrapper);
   	
   	LiansaijifenbangView selectView(@Param("ew") Wrapper<LiansaijifenbangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LiansaijifenbangEntity> wrapper);
   	
}

