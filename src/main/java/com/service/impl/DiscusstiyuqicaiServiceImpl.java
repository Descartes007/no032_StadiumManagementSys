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


import com.dao.DiscusstiyuqicaiDao;
import com.entity.DiscusstiyuqicaiEntity;
import com.service.DiscusstiyuqicaiService;
import com.entity.vo.DiscusstiyuqicaiVO;
import com.entity.view.DiscusstiyuqicaiView;

@Service("discusstiyuqicaiService")
public class DiscusstiyuqicaiServiceImpl extends ServiceImpl<DiscusstiyuqicaiDao, DiscusstiyuqicaiEntity> implements DiscusstiyuqicaiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusstiyuqicaiEntity> page = this.selectPage(
                new Query<DiscusstiyuqicaiEntity>(params).getPage(),
                new EntityWrapper<DiscusstiyuqicaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusstiyuqicaiEntity> wrapper) {
		  Page<DiscusstiyuqicaiView> page =new Query<DiscusstiyuqicaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusstiyuqicaiVO> selectListVO(Wrapper<DiscusstiyuqicaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusstiyuqicaiVO selectVO(Wrapper<DiscusstiyuqicaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusstiyuqicaiView> selectListView(Wrapper<DiscusstiyuqicaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusstiyuqicaiView selectView(Wrapper<DiscusstiyuqicaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
