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


import com.dao.DiscusssirenjiaolianDao;
import com.entity.DiscusssirenjiaolianEntity;
import com.service.DiscusssirenjiaolianService;
import com.entity.vo.DiscusssirenjiaolianVO;
import com.entity.view.DiscusssirenjiaolianView;

@Service("discusssirenjiaolianService")
public class DiscusssirenjiaolianServiceImpl extends ServiceImpl<DiscusssirenjiaolianDao, DiscusssirenjiaolianEntity> implements DiscusssirenjiaolianService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusssirenjiaolianEntity> page = this.selectPage(
                new Query<DiscusssirenjiaolianEntity>(params).getPage(),
                new EntityWrapper<DiscusssirenjiaolianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusssirenjiaolianEntity> wrapper) {
		  Page<DiscusssirenjiaolianView> page =new Query<DiscusssirenjiaolianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusssirenjiaolianVO> selectListVO(Wrapper<DiscusssirenjiaolianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusssirenjiaolianVO selectVO(Wrapper<DiscusssirenjiaolianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusssirenjiaolianView> selectListView(Wrapper<DiscusssirenjiaolianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusssirenjiaolianView selectView(Wrapper<DiscusssirenjiaolianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
