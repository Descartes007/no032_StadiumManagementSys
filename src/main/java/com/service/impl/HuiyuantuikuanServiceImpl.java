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


import com.dao.HuiyuantuikuanDao;
import com.entity.HuiyuantuikuanEntity;
import com.service.HuiyuantuikuanService;
import com.entity.vo.HuiyuantuikuanVO;
import com.entity.view.HuiyuantuikuanView;

@Service("huiyuantuikuanService")
public class HuiyuantuikuanServiceImpl extends ServiceImpl<HuiyuantuikuanDao, HuiyuantuikuanEntity> implements HuiyuantuikuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuiyuantuikuanEntity> page = this.selectPage(
                new Query<HuiyuantuikuanEntity>(params).getPage(),
                new EntityWrapper<HuiyuantuikuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuiyuantuikuanEntity> wrapper) {
		  Page<HuiyuantuikuanView> page =new Query<HuiyuantuikuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuiyuantuikuanVO> selectListVO(Wrapper<HuiyuantuikuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuiyuantuikuanVO selectVO(Wrapper<HuiyuantuikuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuiyuantuikuanView> selectListView(Wrapper<HuiyuantuikuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuiyuantuikuanView selectView(Wrapper<HuiyuantuikuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
