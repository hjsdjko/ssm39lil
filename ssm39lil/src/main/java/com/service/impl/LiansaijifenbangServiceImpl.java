package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.LiansaijifenbangDao;
import com.entity.LiansaijifenbangEntity;
import com.service.LiansaijifenbangService;
import com.entity.vo.LiansaijifenbangVO;
import com.entity.view.LiansaijifenbangView;

@Service("liansaijifenbangService")
public class LiansaijifenbangServiceImpl extends ServiceImpl<LiansaijifenbangDao, LiansaijifenbangEntity> implements LiansaijifenbangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LiansaijifenbangEntity> page = this.selectPage(
                new Query<LiansaijifenbangEntity>(params).getPage(),
                new EntityWrapper<LiansaijifenbangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LiansaijifenbangEntity> wrapper) {
		  Page<LiansaijifenbangView> page =new Query<LiansaijifenbangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LiansaijifenbangVO> selectListVO(Wrapper<LiansaijifenbangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LiansaijifenbangVO selectVO(Wrapper<LiansaijifenbangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LiansaijifenbangView> selectListView(Wrapper<LiansaijifenbangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LiansaijifenbangView selectView(Wrapper<LiansaijifenbangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
