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


import com.dao.QiuyuanDao;
import com.entity.QiuyuanEntity;
import com.service.QiuyuanService;
import com.entity.vo.QiuyuanVO;
import com.entity.view.QiuyuanView;

@Service("qiuyuanService")
public class QiuyuanServiceImpl extends ServiceImpl<QiuyuanDao, QiuyuanEntity> implements QiuyuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QiuyuanEntity> page = this.selectPage(
                new Query<QiuyuanEntity>(params).getPage(),
                new EntityWrapper<QiuyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QiuyuanEntity> wrapper) {
		  Page<QiuyuanView> page =new Query<QiuyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QiuyuanVO> selectListVO(Wrapper<QiuyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QiuyuanVO selectVO(Wrapper<QiuyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QiuyuanView> selectListView(Wrapper<QiuyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QiuyuanView selectView(Wrapper<QiuyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
