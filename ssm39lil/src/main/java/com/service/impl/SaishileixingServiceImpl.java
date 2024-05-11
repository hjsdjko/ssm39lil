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


import com.dao.SaishileixingDao;
import com.entity.SaishileixingEntity;
import com.service.SaishileixingService;
import com.entity.vo.SaishileixingVO;
import com.entity.view.SaishileixingView;

@Service("saishileixingService")
public class SaishileixingServiceImpl extends ServiceImpl<SaishileixingDao, SaishileixingEntity> implements SaishileixingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SaishileixingEntity> page = this.selectPage(
                new Query<SaishileixingEntity>(params).getPage(),
                new EntityWrapper<SaishileixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SaishileixingEntity> wrapper) {
		  Page<SaishileixingView> page =new Query<SaishileixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SaishileixingVO> selectListVO(Wrapper<SaishileixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SaishileixingVO selectVO(Wrapper<SaishileixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SaishileixingView> selectListView(Wrapper<SaishileixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SaishileixingView selectView(Wrapper<SaishileixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
