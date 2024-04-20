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


import com.dao.HuiyuangoumaiDao;
import com.entity.HuiyuangoumaiEntity;
import com.service.HuiyuangoumaiService;
import com.entity.vo.HuiyuangoumaiVO;
import com.entity.view.HuiyuangoumaiView;

@Service("huiyuangoumaiService")
public class HuiyuangoumaiServiceImpl extends ServiceImpl<HuiyuangoumaiDao, HuiyuangoumaiEntity> implements HuiyuangoumaiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuiyuangoumaiEntity> page = this.selectPage(
                new Query<HuiyuangoumaiEntity>(params).getPage(),
                new EntityWrapper<HuiyuangoumaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuiyuangoumaiEntity> wrapper) {
		  Page<HuiyuangoumaiView> page =new Query<HuiyuangoumaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuiyuangoumaiVO> selectListVO(Wrapper<HuiyuangoumaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuiyuangoumaiVO selectVO(Wrapper<HuiyuangoumaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuiyuangoumaiView> selectListView(Wrapper<HuiyuangoumaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuiyuangoumaiView selectView(Wrapper<HuiyuangoumaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
