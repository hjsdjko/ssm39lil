package com.dao;

import com.entity.SaishileixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SaishileixingVO;
import com.entity.view.SaishileixingView;


/**
 * 赛事类型
 * 
 * @author 
 * @email 
 * @date 2021-04-12 10:10:08
 */
public interface SaishileixingDao extends BaseMapper<SaishileixingEntity> {
	
	List<SaishileixingVO> selectListVO(@Param("ew") Wrapper<SaishileixingEntity> wrapper);
	
	SaishileixingVO selectVO(@Param("ew") Wrapper<SaishileixingEntity> wrapper);
	
	List<SaishileixingView> selectListView(@Param("ew") Wrapper<SaishileixingEntity> wrapper);

	List<SaishileixingView> selectListView(Pagination page,@Param("ew") Wrapper<SaishileixingEntity> wrapper);
	
	SaishileixingView selectView(@Param("ew") Wrapper<SaishileixingEntity> wrapper);
	
}
