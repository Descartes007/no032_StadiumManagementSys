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


import com.dao.HuiyuandengjiDao;
import com.entity.HuiyuandengjiEntity;
import com.service.HuiyuandengjiService;
import com.entity.vo.HuiyuandengjiVO;
import com.entity.view.HuiyuandengjiView;

@Service("huiyuandengjiService")
public class HuiyuandengjiServiceImpl extends ServiceImpl<HuiyuandengjiDao, HuiyuandengjiEntity> implements HuiyuandengjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuiyuandengjiEntity> page = this.selectPage(
                new Query<HuiyuandengjiEntity>(params).getPage(),
                new EntityWrapper<HuiyuandengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuiyuandengjiEntity> wrapper) {
		  Page<HuiyuandengjiView> page =new Query<HuiyuandengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuiyuandengjiVO> selectListVO(Wrapper<HuiyuandengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuiyuandengjiVO selectVO(Wrapper<HuiyuandengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuiyuandengjiView> selectListView(Wrapper<HuiyuandengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuiyuandengjiView selectView(Wrapper<HuiyuandengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
