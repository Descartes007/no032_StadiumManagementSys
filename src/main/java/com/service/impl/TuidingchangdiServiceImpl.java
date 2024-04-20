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


import com.dao.TuidingchangdiDao;
import com.entity.TuidingchangdiEntity;
import com.service.TuidingchangdiService;
import com.entity.vo.TuidingchangdiVO;
import com.entity.view.TuidingchangdiView;

@Service("tuidingchangdiService")
public class TuidingchangdiServiceImpl extends ServiceImpl<TuidingchangdiDao, TuidingchangdiEntity> implements TuidingchangdiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TuidingchangdiEntity> page = this.selectPage(
                new Query<TuidingchangdiEntity>(params).getPage(),
                new EntityWrapper<TuidingchangdiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TuidingchangdiEntity> wrapper) {
		  Page<TuidingchangdiView> page =new Query<TuidingchangdiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TuidingchangdiVO> selectListVO(Wrapper<TuidingchangdiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TuidingchangdiVO selectVO(Wrapper<TuidingchangdiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TuidingchangdiView> selectListView(Wrapper<TuidingchangdiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TuidingchangdiView selectView(Wrapper<TuidingchangdiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
