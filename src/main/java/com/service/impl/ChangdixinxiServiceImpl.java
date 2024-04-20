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


import com.dao.ChangdixinxiDao;
import com.entity.ChangdixinxiEntity;
import com.service.ChangdixinxiService;
import com.entity.vo.ChangdixinxiVO;
import com.entity.view.ChangdixinxiView;

@Service("changdixinxiService")
public class ChangdixinxiServiceImpl extends ServiceImpl<ChangdixinxiDao, ChangdixinxiEntity> implements ChangdixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChangdixinxiEntity> page = this.selectPage(
                new Query<ChangdixinxiEntity>(params).getPage(),
                new EntityWrapper<ChangdixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChangdixinxiEntity> wrapper) {
		  Page<ChangdixinxiView> page =new Query<ChangdixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChangdixinxiVO> selectListVO(Wrapper<ChangdixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChangdixinxiVO selectVO(Wrapper<ChangdixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChangdixinxiView> selectListView(Wrapper<ChangdixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChangdixinxiView selectView(Wrapper<ChangdixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
