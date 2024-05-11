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


import com.dao.ZuqiuzhoubianDao;
import com.entity.ZuqiuzhoubianEntity;
import com.service.ZuqiuzhoubianService;
import com.entity.vo.ZuqiuzhoubianVO;
import com.entity.view.ZuqiuzhoubianView;

@Service("zuqiuzhoubianService")
public class ZuqiuzhoubianServiceImpl extends ServiceImpl<ZuqiuzhoubianDao, ZuqiuzhoubianEntity> implements ZuqiuzhoubianService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZuqiuzhoubianEntity> page = this.selectPage(
                new Query<ZuqiuzhoubianEntity>(params).getPage(),
                new EntityWrapper<ZuqiuzhoubianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZuqiuzhoubianEntity> wrapper) {
		  Page<ZuqiuzhoubianView> page =new Query<ZuqiuzhoubianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZuqiuzhoubianVO> selectListVO(Wrapper<ZuqiuzhoubianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZuqiuzhoubianVO selectVO(Wrapper<ZuqiuzhoubianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZuqiuzhoubianView> selectListView(Wrapper<ZuqiuzhoubianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZuqiuzhoubianView selectView(Wrapper<ZuqiuzhoubianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
