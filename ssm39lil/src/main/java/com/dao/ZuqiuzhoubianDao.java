package com.dao;

import com.entity.ZuqiuzhoubianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZuqiuzhoubianVO;
import com.entity.view.ZuqiuzhoubianView;


/**
 * 足球周边
 * 
 * @author 
 * @email 
 * @date 2021-04-12 10:10:08
 */
public interface ZuqiuzhoubianDao extends BaseMapper<ZuqiuzhoubianEntity> {
	
	List<ZuqiuzhoubianVO> selectListVO(@Param("ew") Wrapper<ZuqiuzhoubianEntity> wrapper);
	
	ZuqiuzhoubianVO selectVO(@Param("ew") Wrapper<ZuqiuzhoubianEntity> wrapper);
	
	List<ZuqiuzhoubianView> selectListView(@Param("ew") Wrapper<ZuqiuzhoubianEntity> wrapper);

	List<ZuqiuzhoubianView> selectListView(Pagination page,@Param("ew") Wrapper<ZuqiuzhoubianEntity> wrapper);
	
	ZuqiuzhoubianView selectView(@Param("ew") Wrapper<ZuqiuzhoubianEntity> wrapper);
	
}
