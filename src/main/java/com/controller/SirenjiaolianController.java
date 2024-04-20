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

import com.entity.SirenjiaolianEntity;
import com.entity.view.SirenjiaolianView;

import com.service.SirenjiaolianService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 私人教练
 * 后端接口
 * @author 
 * @email 
 * @date 2022-03-11 11:00:59
 */
@RestController
@RequestMapping("/sirenjiaolian")
public class SirenjiaolianController {
    @Autowired
    private SirenjiaolianService sirenjiaolianService;

    @Autowired
    private StoreupService storeupService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,SirenjiaolianEntity sirenjiaolian,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jianshenjiaolian")) {
			sirenjiaolian.setJiaoliangonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<SirenjiaolianEntity> ew = new EntityWrapper<SirenjiaolianEntity>();
		PageUtils page = sirenjiaolianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, sirenjiaolian), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,SirenjiaolianEntity sirenjiaolian, 
		HttpServletRequest request){
        EntityWrapper<SirenjiaolianEntity> ew = new EntityWrapper<SirenjiaolianEntity>();
		PageUtils page = sirenjiaolianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, sirenjiaolian), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( SirenjiaolianEntity sirenjiaolian){
       	EntityWrapper<SirenjiaolianEntity> ew = new EntityWrapper<SirenjiaolianEntity>();
      	ew.allEq(MPUtil.allEQMapPre( sirenjiaolian, "sirenjiaolian")); 
        return R.ok().put("data", sirenjiaolianService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(SirenjiaolianEntity sirenjiaolian){
        EntityWrapper< SirenjiaolianEntity> ew = new EntityWrapper< SirenjiaolianEntity>();
 		ew.allEq(MPUtil.allEQMapPre( sirenjiaolian, "sirenjiaolian")); 
		SirenjiaolianView sirenjiaolianView =  sirenjiaolianService.selectView(ew);
		return R.ok("查询私人教练成功").put("data", sirenjiaolianView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        SirenjiaolianEntity sirenjiaolian = sirenjiaolianService.selectById(id);
        return R.ok().put("data", sirenjiaolian);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        SirenjiaolianEntity sirenjiaolian = sirenjiaolianService.selectById(id);
        return R.ok().put("data", sirenjiaolian);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R vote(@PathVariable("id") String id,String type){
        SirenjiaolianEntity sirenjiaolian = sirenjiaolianService.selectById(id);
        if(type.equals("1")) {
        	sirenjiaolian.setThumbsupnum(sirenjiaolian.getThumbsupnum()+1);
        } else {
        	sirenjiaolian.setCrazilynum(sirenjiaolian.getCrazilynum()+1);
        }
        sirenjiaolianService.updateById(sirenjiaolian);
        return R.ok("投票成功");
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SirenjiaolianEntity sirenjiaolian, HttpServletRequest request){
    	sirenjiaolian.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(sirenjiaolian);
        sirenjiaolianService.insert(sirenjiaolian);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody SirenjiaolianEntity sirenjiaolian, HttpServletRequest request){
    	sirenjiaolian.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(sirenjiaolian);
        sirenjiaolianService.insert(sirenjiaolian);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody SirenjiaolianEntity sirenjiaolian, HttpServletRequest request){
        //ValidatorUtils.validateEntity(sirenjiaolian);
        sirenjiaolianService.updateById(sirenjiaolian);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        sirenjiaolianService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<SirenjiaolianEntity> wrapper = new EntityWrapper<SirenjiaolianEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jianshenjiaolian")) {
			wrapper.eq("jiaoliangonghao", (String)request.getSession().getAttribute("username"));
		}

		int count = sirenjiaolianService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
