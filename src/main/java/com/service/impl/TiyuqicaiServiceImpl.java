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


import com.dao.TiyuqicaiDao;
import com.entity.TiyuqicaiEntity;
import com.service.TiyuqicaiService;
import com.entity.vo.TiyuqicaiVO;
import com.entity.view.TiyuqicaiView;

@Service("tiyuqicaiService")
public class TiyuqicaiServiceImpl extends ServiceImpl<TiyuqicaiDao, TiyuqicaiEntity> implements TiyuqicaiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TiyuqicaiEntity> page = this.selectPage(
                new Query<TiyuqicaiEntity>(params).getPage(),
                new EntityWrapper<TiyuqicaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TiyuqicaiEntity> wrapper) {
		  Page<TiyuqicaiView> page =new Query<TiyuqicaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TiyuqicaiVO> selectListVO(Wrapper<TiyuqicaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TiyuqicaiVO selectVO(Wrapper<TiyuqicaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TiyuqicaiView> selectListView(Wrapper<TiyuqicaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TiyuqicaiView selectView(Wrapper<TiyuqicaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
