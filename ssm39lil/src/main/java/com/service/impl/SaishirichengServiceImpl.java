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


import com.dao.SaishirichengDao;
import com.entity.SaishirichengEntity;
import com.service.SaishirichengService;
import com.entity.vo.SaishirichengVO;
import com.entity.view.SaishirichengView;

@Service("saishirichengService")
public class SaishirichengServiceImpl extends ServiceImpl<SaishirichengDao, SaishirichengEntity> implements SaishirichengService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SaishirichengEntity> page = this.selectPage(
                new Query<SaishirichengEntity>(params).getPage(),
                new EntityWrapper<SaishirichengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SaishirichengEntity> wrapper) {
		  Page<SaishirichengView> page =new Query<SaishirichengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SaishirichengVO> selectListVO(Wrapper<SaishirichengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SaishirichengVO selectVO(Wrapper<SaishirichengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SaishirichengView> selectListView(Wrapper<SaishirichengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SaishirichengView selectView(Wrapper<SaishirichengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
