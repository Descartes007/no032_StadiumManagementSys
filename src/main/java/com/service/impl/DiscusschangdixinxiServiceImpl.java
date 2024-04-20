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


import com.dao.DiscusschangdixinxiDao;
import com.entity.DiscusschangdixinxiEntity;
import com.service.DiscusschangdixinxiService;
import com.entity.vo.DiscusschangdixinxiVO;
import com.entity.view.DiscusschangdixinxiView;

@Service("discusschangdixinxiService")
public class DiscusschangdixinxiServiceImpl extends ServiceImpl<DiscusschangdixinxiDao, DiscusschangdixinxiEntity> implements DiscusschangdixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusschangdixinxiEntity> page = this.selectPage(
                new Query<DiscusschangdixinxiEntity>(params).getPage(),
                new EntityWrapper<DiscusschangdixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusschangdixinxiEntity> wrapper) {
		  Page<DiscusschangdixinxiView> page =new Query<DiscusschangdixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusschangdixinxiVO> selectListVO(Wrapper<DiscusschangdixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusschangdixinxiVO selectVO(Wrapper<DiscusschangdixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusschangdixinxiView> selectListView(Wrapper<DiscusschangdixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusschangdixinxiView selectView(Wrapper<DiscusschangdixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
