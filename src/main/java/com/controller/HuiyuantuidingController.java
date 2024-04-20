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

import com.entity.HuiyuantuidingEntity;
import com.entity.view.HuiyuantuidingView;

import com.service.HuiyuantuidingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 会员退订
 * 后端接口
 * @author 
 * @email 
 * @date 2022-03-11 11:00:59
 */
@RestController
@RequestMapping("/huiyuantuiding")
public class HuiyuantuidingController {
    @Autowired
    private HuiyuantuidingService huiyuantuidingService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,HuiyuantuidingEntity huiyuantuiding,
                @RequestParam(required = false) Double rencistart,
                @RequestParam(required = false) Double renciend,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("huiyuan")) {
			huiyuantuiding.setHuiyuanzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<HuiyuantuidingEntity> ew = new EntityWrapper<HuiyuantuidingEntity>();
                if(rencistart!=null) ew.ge("renci", rencistart);
                if(renciend!=null) ew.le("renci", renciend);
		PageUtils page = huiyuantuidingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, huiyuantuiding), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,HuiyuantuidingEntity huiyuantuiding, 
                @RequestParam(required = false) Double rencistart,
                @RequestParam(required = false) Double renciend,
		HttpServletRequest request){
        EntityWrapper<HuiyuantuidingEntity> ew = new EntityWrapper<HuiyuantuidingEntity>();
                if(rencistart!=null) ew.ge("renci", rencistart);
                if(renciend!=null) ew.le("renci", renciend);
		PageUtils page = huiyuantuidingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, huiyuantuiding), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( HuiyuantuidingEntity huiyuantuiding){
       	EntityWrapper<HuiyuantuidingEntity> ew = new EntityWrapper<HuiyuantuidingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( huiyuantuiding, "huiyuantuiding")); 
        return R.ok().put("data", huiyuantuidingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(HuiyuantuidingEntity huiyuantuiding){
        EntityWrapper< HuiyuantuidingEntity> ew = new EntityWrapper< HuiyuantuidingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( huiyuantuiding, "huiyuantuiding")); 
		HuiyuantuidingView huiyuantuidingView =  huiyuantuidingService.selectView(ew);
		return R.ok("查询会员退订成功").put("data", huiyuantuidingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        HuiyuantuidingEntity huiyuantuiding = huiyuantuidingService.selectById(id);
        return R.ok().put("data", huiyuantuiding);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        HuiyuantuidingEntity huiyuantuiding = huiyuantuidingService.selectById(id);
        return R.ok().put("data", huiyuantuiding);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody HuiyuantuidingEntity huiyuantuiding, HttpServletRequest request){
    	huiyuantuiding.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(huiyuantuiding);
        huiyuantuidingService.insert(huiyuantuiding);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody HuiyuantuidingEntity huiyuantuiding, HttpServletRequest request){
    	huiyuantuiding.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(huiyuantuiding);
        huiyuantuidingService.insert(huiyuantuiding);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody HuiyuantuidingEntity huiyuantuiding, HttpServletRequest request){
        //ValidatorUtils.validateEntity(huiyuantuiding);
        huiyuantuidingService.updateById(huiyuantuiding);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        huiyuantuidingService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<HuiyuantuidingEntity> wrapper = new EntityWrapper<HuiyuantuidingEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("huiyuan")) {
			wrapper.eq("huiyuanzhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = huiyuantuidingService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
