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


import com.dao.ChangdiyuyueDao;
import com.entity.ChangdiyuyueEntity;
import com.service.ChangdiyuyueService;
import com.entity.vo.ChangdiyuyueVO;
import com.entity.view.ChangdiyuyueView;

@Service("changdiyuyueService")
public class ChangdiyuyueServiceImpl extends ServiceImpl<ChangdiyuyueDao, ChangdiyuyueEntity> implements ChangdiyuyueService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChangdiyuyueEntity> page = this.selectPage(
                new Query<ChangdiyuyueEntity>(params).getPage(),
                new EntityWrapper<ChangdiyuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChangdiyuyueEntity> wrapper) {
		  Page<ChangdiyuyueView> page =new Query<ChangdiyuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChangdiyuyueVO> selectListVO(Wrapper<ChangdiyuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChangdiyuyueVO selectVO(Wrapper<ChangdiyuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChangdiyuyueView> selectListView(Wrapper<ChangdiyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChangdiyuyueView selectView(Wrapper<ChangdiyuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
