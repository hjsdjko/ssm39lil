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


import com.dao.BeisaijifenbangDao;
import com.entity.BeisaijifenbangEntity;
import com.service.BeisaijifenbangService;
import com.entity.vo.BeisaijifenbangVO;
import com.entity.view.BeisaijifenbangView;

@Service("beisaijifenbangService")
public class BeisaijifenbangServiceImpl extends ServiceImpl<BeisaijifenbangDao, BeisaijifenbangEntity> implements BeisaijifenbangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BeisaijifenbangEntity> page = this.selectPage(
                new Query<BeisaijifenbangEntity>(params).getPage(),
                new EntityWrapper<BeisaijifenbangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BeisaijifenbangEntity> wrapper) {
		  Page<BeisaijifenbangView> page =new Query<BeisaijifenbangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BeisaijifenbangVO> selectListVO(Wrapper<BeisaijifenbangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BeisaijifenbangVO selectVO(Wrapper<BeisaijifenbangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BeisaijifenbangView> selectListView(Wrapper<BeisaijifenbangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BeisaijifenbangView selectView(Wrapper<BeisaijifenbangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
