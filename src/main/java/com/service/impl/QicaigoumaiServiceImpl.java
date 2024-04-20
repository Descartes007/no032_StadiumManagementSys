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


import com.dao.QicaigoumaiDao;
import com.entity.QicaigoumaiEntity;
import com.service.QicaigoumaiService;
import com.entity.vo.QicaigoumaiVO;
import com.entity.view.QicaigoumaiView;

@Service("qicaigoumaiService")
public class QicaigoumaiServiceImpl extends ServiceImpl<QicaigoumaiDao, QicaigoumaiEntity> implements QicaigoumaiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QicaigoumaiEntity> page = this.selectPage(
                new Query<QicaigoumaiEntity>(params).getPage(),
                new EntityWrapper<QicaigoumaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QicaigoumaiEntity> wrapper) {
		  Page<QicaigoumaiView> page =new Query<QicaigoumaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QicaigoumaiVO> selectListVO(Wrapper<QicaigoumaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QicaigoumaiVO selectVO(Wrapper<QicaigoumaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QicaigoumaiView> selectListView(Wrapper<QicaigoumaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QicaigoumaiView selectView(Wrapper<QicaigoumaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
