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


import com.dao.HuiyuantuidingDao;
import com.entity.HuiyuantuidingEntity;
import com.service.HuiyuantuidingService;
import com.entity.vo.HuiyuantuidingVO;
import com.entity.view.HuiyuantuidingView;

@Service("huiyuantuidingService")
public class HuiyuantuidingServiceImpl extends ServiceImpl<HuiyuantuidingDao, HuiyuantuidingEntity> implements HuiyuantuidingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuiyuantuidingEntity> page = this.selectPage(
                new Query<HuiyuantuidingEntity>(params).getPage(),
                new EntityWrapper<HuiyuantuidingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuiyuantuidingEntity> wrapper) {
		  Page<HuiyuantuidingView> page =new Query<HuiyuantuidingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuiyuantuidingVO> selectListVO(Wrapper<HuiyuantuidingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuiyuantuidingVO selectVO(Wrapper<HuiyuantuidingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuiyuantuidingView> selectListView(Wrapper<HuiyuantuidingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuiyuantuidingView selectView(Wrapper<HuiyuantuidingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
