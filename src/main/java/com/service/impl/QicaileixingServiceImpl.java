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


import com.dao.QicaileixingDao;
import com.entity.QicaileixingEntity;
import com.service.QicaileixingService;
import com.entity.vo.QicaileixingVO;
import com.entity.view.QicaileixingView;

@Service("qicaileixingService")
public class QicaileixingServiceImpl extends ServiceImpl<QicaileixingDao, QicaileixingEntity> implements QicaileixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QicaileixingEntity> page = this.selectPage(
                new Query<QicaileixingEntity>(params).getPage(),
                new EntityWrapper<QicaileixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QicaileixingEntity> wrapper) {
		  Page<QicaileixingView> page =new Query<QicaileixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QicaileixingVO> selectListVO(Wrapper<QicaileixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QicaileixingVO selectVO(Wrapper<QicaileixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QicaileixingView> selectListView(Wrapper<QicaileixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QicaileixingView selectView(Wrapper<QicaileixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
