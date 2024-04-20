package com.dao;

import com.entity.HuiyuantuikuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuiyuantuikuanVO;
import com.entity.view.HuiyuantuikuanView;


/**
 * 会员退款
 * 
 * @author 
 * @email 
 * @date 2022-03-11 11:00:59
 */
public interface HuiyuantuikuanDao extends BaseMapper<HuiyuantuikuanEntity> {
	
	List<HuiyuantuikuanVO> selectListVO(@Param("ew") Wrapper<HuiyuantuikuanEntity> wrapper);
	
	HuiyuantuikuanVO selectVO(@Param("ew") Wrapper<HuiyuantuikuanEntity> wrapper);
	
	List<HuiyuantuikuanView> selectListView(@Param("ew") Wrapper<HuiyuantuikuanEntity> wrapper);

	List<HuiyuantuikuanView> selectListView(Pagination page,@Param("ew") Wrapper<HuiyuantuikuanEntity> wrapper);
	
	HuiyuantuikuanView selectView(@Param("ew") Wrapper<HuiyuantuikuanEntity> wrapper);
	

}
