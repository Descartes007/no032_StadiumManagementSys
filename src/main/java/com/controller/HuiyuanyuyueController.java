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

import com.entity.HuiyuanyuyueEntity;
import com.entity.view.HuiyuanyuyueView;

import com.service.HuiyuanyuyueService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 会员预约
 * 后端接口
 * @author 
 * @email 
 * @date 2022-03-11 11:00:59
 */
@RestController
@RequestMapping("/huiyuanyuyue")
public class HuiyuanyuyueController {
    @Autowired
    private HuiyuanyuyueService huiyuanyuyueService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,HuiyuanyuyueEntity huiyuanyuyue,
                @RequestParam(required = false) Double rencistart,
                @RequestParam(required = false) Double renciend,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("huiyuan")) {
			huiyuanyuyue.setHuiyuanzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<HuiyuanyuyueEntity> ew = new EntityWrapper<HuiyuanyuyueEntity>();
                if(rencistart!=null) ew.ge("renci", rencistart);
                if(renciend!=null) ew.le("renci", renciend);
		PageUtils page = huiyuanyuyueService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, huiyuanyuyue), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,HuiyuanyuyueEntity huiyuanyuyue, 
                @RequestParam(required = false) Double rencistart,
                @RequestParam(required = false) Double renciend,
		HttpServletRequest request){
        EntityWrapper<HuiyuanyuyueEntity> ew = new EntityWrapper<HuiyuanyuyueEntity>();
                if(rencistart!=null) ew.ge("renci", rencistart);
                if(renciend!=null) ew.le("renci", renciend);
		PageUtils page = huiyuanyuyueService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, huiyuanyuyue), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( HuiyuanyuyueEntity huiyuanyuyue){
       	EntityWrapper<HuiyuanyuyueEntity> ew = new EntityWrapper<HuiyuanyuyueEntity>();
      	ew.allEq(MPUtil.allEQMapPre( huiyuanyuyue, "huiyuanyuyue")); 
        return R.ok().put("data", huiyuanyuyueService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(HuiyuanyuyueEntity huiyuanyuyue){
        EntityWrapper< HuiyuanyuyueEntity> ew = new EntityWrapper< HuiyuanyuyueEntity>();
 		ew.allEq(MPUtil.allEQMapPre( huiyuanyuyue, "huiyuanyuyue")); 
		HuiyuanyuyueView huiyuanyuyueView =  huiyuanyuyueService.selectView(ew);
		return R.ok("查询会员预约成功").put("data", huiyuanyuyueView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        HuiyuanyuyueEntity huiyuanyuyue = huiyuanyuyueService.selectById(id);
        return R.ok().put("data", huiyuanyuyue);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        HuiyuanyuyueEntity huiyuanyuyue = huiyuanyuyueService.selectById(id);
        return R.ok().put("data", huiyuanyuyue);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody HuiyuanyuyueEntity huiyuanyuyue, HttpServletRequest request){
    	huiyuanyuyue.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(huiyuanyuyue);
        huiyuanyuyueService.insert(huiyuanyuyue);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody HuiyuanyuyueEntity huiyuanyuyue, HttpServletRequest request){
    	huiyuanyuyue.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(huiyuanyuyue);
        huiyuanyuyueService.insert(huiyuanyuyue);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody HuiyuanyuyueEntity huiyuanyuyue, HttpServletRequest request){
        //ValidatorUtils.validateEntity(huiyuanyuyue);
        huiyuanyuyueService.updateById(huiyuanyuyue);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        huiyuanyuyueService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<HuiyuanyuyueEntity> wrapper = new EntityWrapper<HuiyuanyuyueEntity>();
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

		int count = huiyuanyuyueService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
