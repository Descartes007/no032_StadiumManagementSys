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

import com.entity.TuidingchangdiEntity;
import com.entity.view.TuidingchangdiView;

import com.service.TuidingchangdiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 退订场地
 * 后端接口
 * @author 
 * @email 
 * @date 2022-03-11 11:00:59
 */
@RestController
@RequestMapping("/tuidingchangdi")
public class TuidingchangdiController {
    @Autowired
    private TuidingchangdiService tuidingchangdiService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,TuidingchangdiEntity tuidingchangdi,
                @RequestParam(required = false) Double rencistart,
                @RequestParam(required = false) Double renciend,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			tuidingchangdi.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<TuidingchangdiEntity> ew = new EntityWrapper<TuidingchangdiEntity>();
                if(rencistart!=null) ew.ge("renci", rencistart);
                if(renciend!=null) ew.le("renci", renciend);
		PageUtils page = tuidingchangdiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tuidingchangdi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,TuidingchangdiEntity tuidingchangdi, 
                @RequestParam(required = false) Double rencistart,
                @RequestParam(required = false) Double renciend,
		HttpServletRequest request){
        EntityWrapper<TuidingchangdiEntity> ew = new EntityWrapper<TuidingchangdiEntity>();
                if(rencistart!=null) ew.ge("renci", rencistart);
                if(renciend!=null) ew.le("renci", renciend);
		PageUtils page = tuidingchangdiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tuidingchangdi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( TuidingchangdiEntity tuidingchangdi){
       	EntityWrapper<TuidingchangdiEntity> ew = new EntityWrapper<TuidingchangdiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( tuidingchangdi, "tuidingchangdi")); 
        return R.ok().put("data", tuidingchangdiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(TuidingchangdiEntity tuidingchangdi){
        EntityWrapper< TuidingchangdiEntity> ew = new EntityWrapper< TuidingchangdiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( tuidingchangdi, "tuidingchangdi")); 
		TuidingchangdiView tuidingchangdiView =  tuidingchangdiService.selectView(ew);
		return R.ok("查询退订场地成功").put("data", tuidingchangdiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        TuidingchangdiEntity tuidingchangdi = tuidingchangdiService.selectById(id);
        return R.ok().put("data", tuidingchangdi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        TuidingchangdiEntity tuidingchangdi = tuidingchangdiService.selectById(id);
        return R.ok().put("data", tuidingchangdi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TuidingchangdiEntity tuidingchangdi, HttpServletRequest request){
    	tuidingchangdi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(tuidingchangdi);
        tuidingchangdiService.insert(tuidingchangdi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody TuidingchangdiEntity tuidingchangdi, HttpServletRequest request){
    	tuidingchangdi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(tuidingchangdi);
        tuidingchangdiService.insert(tuidingchangdi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TuidingchangdiEntity tuidingchangdi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(tuidingchangdi);
        tuidingchangdiService.updateById(tuidingchangdi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        tuidingchangdiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<TuidingchangdiEntity> wrapper = new EntityWrapper<TuidingchangdiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("zhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = tuidingchangdiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
