package com.dao;

import com.entity.LiansaijifenbangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LiansaijifenbangVO;
import com.entity.view.LiansaijifenbangView;


/**
 * 联赛积分榜
 * 
 * @author 
 * @email 
 * @date 2021-04-12 10:10:08
 */
public interface LiansaijifenbangDao extends BaseMapper<LiansaijifenbangEntity> {
	
	List<LiansaijifenbangVO> selectListVO(@Param("ew") Wrapper<LiansaijifenbangEntity> wrapper);
	
	LiansaijifenbangVO selectVO(@Param("ew") Wrapper<LiansaijifenbangEntity> wrapper);
	
	List<LiansaijifenbangView> selectListView(@Param("ew") Wrapper<LiansaijifenbangEntity> wrapper);

	List<LiansaijifenbangView> selectListView(Pagination page,@Param("ew") Wrapper<LiansaijifenbangEntity> wrapper);
	
	LiansaijifenbangView selectView(@Param("ew") Wrapper<LiansaijifenbangEntity> wrapper);
	
}
