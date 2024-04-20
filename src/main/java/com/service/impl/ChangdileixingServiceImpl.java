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


import com.dao.ChangdileixingDao;
import com.entity.ChangdileixingEntity;
import com.service.ChangdileixingService;
import com.entity.vo.ChangdileixingVO;
import com.entity.view.ChangdileixingView;

@Service("changdileixingService")
public class ChangdileixingServiceImpl extends ServiceImpl<ChangdileixingDao, ChangdileixingEntity> implements ChangdileixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChangdileixingEntity> page = this.selectPage(
                new Query<ChangdileixingEntity>(params).getPage(),
                new EntityWrapper<ChangdileixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChangdileixingEntity> wrapper) {
		  Page<ChangdileixingView> page =new Query<ChangdileixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChangdileixingVO> selectListVO(Wrapper<ChangdileixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChangdileixingVO selectVO(Wrapper<ChangdileixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChangdileixingView> selectListView(Wrapper<ChangdileixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChangdileixingView selectView(Wrapper<ChangdileixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
