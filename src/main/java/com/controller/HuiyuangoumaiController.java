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

import com.entity.HuiyuangoumaiEntity;
import com.entity.view.HuiyuangoumaiView;

import com.service.HuiyuangoumaiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 会员购买
 * 后端接口
 * @author 
 * @email 
 * @date 2022-03-11 11:00:59
 */
@RestController
@RequestMapping("/huiyuangoumai")
public class HuiyuangoumaiController {
    @Autowired
    private HuiyuangoumaiService huiyuangoumaiService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,HuiyuangoumaiEntity huiyuangoumai,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("huiyuan")) {
			huiyuangoumai.setHuiyuanzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<HuiyuangoumaiEntity> ew = new EntityWrapper<HuiyuangoumaiEntity>();
		PageUtils page = huiyuangoumaiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, huiyuangoumai), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,HuiyuangoumaiEntity huiyuangoumai, 
		HttpServletRequest request){
        EntityWrapper<HuiyuangoumaiEntity> ew = new EntityWrapper<HuiyuangoumaiEntity>();
		PageUtils page = huiyuangoumaiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, huiyuangoumai), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( HuiyuangoumaiEntity huiyuangoumai){
       	EntityWrapper<HuiyuangoumaiEntity> ew = new EntityWrapper<HuiyuangoumaiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( huiyuangoumai, "huiyuangoumai")); 
        return R.ok().put("data", huiyuangoumaiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(HuiyuangoumaiEntity huiyuangoumai){
        EntityWrapper< HuiyuangoumaiEntity> ew = new EntityWrapper< HuiyuangoumaiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( huiyuangoumai, "huiyuangoumai")); 
		HuiyuangoumaiView huiyuangoumaiView =  huiyuangoumaiService.selectView(ew);
		return R.ok("查询会员购买成功").put("data", huiyuangoumaiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        HuiyuangoumaiEntity huiyuangoumai = huiyuangoumaiService.selectById(id);
        return R.ok().put("data", huiyuangoumai);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        HuiyuangoumaiEntity huiyuangoumai = huiyuangoumaiService.selectById(id);
        return R.ok().put("data", huiyuangoumai);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody HuiyuangoumaiEntity huiyuangoumai, HttpServletRequest request){
    	huiyuangoumai.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(huiyuangoumai);
        huiyuangoumaiService.insert(huiyuangoumai);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody HuiyuangoumaiEntity huiyuangoumai, HttpServletRequest request){
    	huiyuangoumai.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(huiyuangoumai);
        huiyuangoumaiService.insert(huiyuangoumai);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody HuiyuangoumaiEntity huiyuangoumai, HttpServletRequest request){
        //ValidatorUtils.validateEntity(huiyuangoumai);
        huiyuangoumaiService.updateById(huiyuangoumai);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        huiyuangoumaiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<HuiyuangoumaiEntity> wrapper = new EntityWrapper<HuiyuangoumaiEntity>();
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

		int count = huiyuangoumaiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
