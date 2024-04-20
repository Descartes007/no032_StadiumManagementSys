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


import com.dao.SirenjiaolianDao;
import com.entity.SirenjiaolianEntity;
import com.service.SirenjiaolianService;
import com.entity.vo.SirenjiaolianVO;
import com.entity.view.SirenjiaolianView;

@Service("sirenjiaolianService")
public class SirenjiaolianServiceImpl extends ServiceImpl<SirenjiaolianDao, SirenjiaolianEntity> implements SirenjiaolianService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SirenjiaolianEntity> page = this.selectPage(
                new Query<SirenjiaolianEntity>(params).getPage(),
                new EntityWrapper<SirenjiaolianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SirenjiaolianEntity> wrapper) {
		  Page<SirenjiaolianView> page =new Query<SirenjiaolianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SirenjiaolianVO> selectListVO(Wrapper<SirenjiaolianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SirenjiaolianVO selectVO(Wrapper<SirenjiaolianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SirenjiaolianView> selectListView(Wrapper<SirenjiaolianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SirenjiaolianView selectView(Wrapper<SirenjiaolianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
