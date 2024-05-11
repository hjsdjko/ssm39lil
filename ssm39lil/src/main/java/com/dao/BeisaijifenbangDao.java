package com.dao;

import com.entity.BeisaijifenbangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BeisaijifenbangVO;
import com.entity.view.BeisaijifenbangView;


/**
 * 杯赛积分榜
 * 
 * @author 
 * @email 
 * @date 2021-04-12 10:10:08
 */
public interface BeisaijifenbangDao extends BaseMapper<BeisaijifenbangEntity> {
	
	List<BeisaijifenbangVO> selectListVO(@Param("ew") Wrapper<BeisaijifenbangEntity> wrapper);
	
	BeisaijifenbangVO selectVO(@Param("ew") Wrapper<BeisaijifenbangEntity> wrapper);
	
	List<BeisaijifenbangView> selectListView(@Param("ew") Wrapper<BeisaijifenbangEntity> wrapper);

	List<BeisaijifenbangView> selectListView(Pagination page,@Param("ew") Wrapper<BeisaijifenbangEntity> wrapper);
	
	BeisaijifenbangView selectView(@Param("ew") Wrapper<BeisaijifenbangEntity> wrapper);
	
}
