package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.SaishirichengEntity;
import com.entity.view.SaishirichengView;

import com.service.SaishirichengService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 赛事日程
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-12 10:10:08
 */
@RestController
@RequestMapping("/saishiricheng")
public class SaishirichengController {
    @Autowired
    private SaishirichengService saishirichengService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,SaishirichengEntity saishiricheng, 
		HttpServletRequest request){

        EntityWrapper<SaishirichengEntity> ew = new EntityWrapper<SaishirichengEntity>();
		PageUtils page = saishirichengService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, saishiricheng), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,SaishirichengEntity saishiricheng, HttpServletRequest request){
        EntityWrapper<SaishirichengEntity> ew = new EntityWrapper<SaishirichengEntity>();
		PageUtils page = saishirichengService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, saishiricheng), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( SaishirichengEntity saishiricheng){
       	EntityWrapper<SaishirichengEntity> ew = new EntityWrapper<SaishirichengEntity>();
      	ew.allEq(MPUtil.allEQMapPre( saishiricheng, "saishiricheng")); 
        return R.ok().put("data", saishirichengService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(SaishirichengEntity saishiricheng){
        EntityWrapper< SaishirichengEntity> ew = new EntityWrapper< SaishirichengEntity>();
 		ew.allEq(MPUtil.allEQMapPre( saishiricheng, "saishiricheng")); 
		SaishirichengView saishirichengView =  saishirichengService.selectView(ew);
		return R.ok("查询赛事日程成功").put("data", saishirichengView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        SaishirichengEntity saishiricheng = saishirichengService.selectById(id);
        return R.ok().put("data", saishiricheng);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        SaishirichengEntity saishiricheng = saishirichengService.selectById(id);
        return R.ok().put("data", saishiricheng);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SaishirichengEntity saishiricheng, HttpServletRequest request){
    	saishiricheng.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(saishiricheng);

        saishirichengService.insert(saishiricheng);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody SaishirichengEntity saishiricheng, HttpServletRequest request){
    	saishiricheng.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(saishiricheng);

        saishirichengService.insert(saishiricheng);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody SaishirichengEntity saishiricheng, HttpServletRequest request){
        //ValidatorUtils.validateEntity(saishiricheng);
        saishirichengService.updateById(saishiricheng);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        saishirichengService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<SaishirichengEntity> wrapper = new EntityWrapper<SaishirichengEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = saishirichengService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
