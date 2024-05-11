package com.dao;

import com.entity.SaishirichengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SaishirichengVO;
import com.entity.view.SaishirichengView;


/**
 * 赛事日程
 * 
 * @author 
 * @email 
 * @date 2021-04-12 10:10:08
 */
public interface SaishirichengDao extends BaseMapper<SaishirichengEntity> {
	
	List<SaishirichengVO> selectListVO(@Param("ew") Wrapper<SaishirichengEntity> wrapper);
	
	SaishirichengVO selectVO(@Param("ew") Wrapper<SaishirichengEntity> wrapper);
	
	List<SaishirichengView> selectListView(@Param("ew") Wrapper<SaishirichengEntity> wrapper);

	List<SaishirichengView> selectListView(Pagination page,@Param("ew") Wrapper<SaishirichengEntity> wrapper);
	
	SaishirichengView selectView(@Param("ew") Wrapper<SaishirichengEntity> wrapper);
	
}
