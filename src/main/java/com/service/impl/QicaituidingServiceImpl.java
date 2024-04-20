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


import com.dao.QicaituidingDao;
import com.entity.QicaituidingEntity;
import com.service.QicaituidingService;
import com.entity.vo.QicaituidingVO;
import com.entity.view.QicaituidingView;

@Service("qicaituidingService")
public class QicaituidingServiceImpl extends ServiceImpl<QicaituidingDao, QicaituidingEntity> implements QicaituidingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QicaituidingEntity> page = this.selectPage(
                new Query<QicaituidingEntity>(params).getPage(),
                new EntityWrapper<QicaituidingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QicaituidingEntity> wrapper) {
		  Page<QicaituidingView> page =new Query<QicaituidingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QicaituidingVO> selectListVO(Wrapper<QicaituidingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QicaituidingVO selectVO(Wrapper<QicaituidingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QicaituidingView> selectListView(Wrapper<QicaituidingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QicaituidingView selectView(Wrapper<QicaituidingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
