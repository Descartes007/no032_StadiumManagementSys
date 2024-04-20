package com.dao;

import com.entity.SijiaoyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SijiaoyuyueVO;
import com.entity.view.SijiaoyuyueView;


/**
 * 私教预约
 * 
 * @author 
 * @email 
 * @date 2022-03-11 11:00:59
 */
public interface SijiaoyuyueDao extends BaseMapper<SijiaoyuyueEntity> {
	
	List<SijiaoyuyueVO> selectListVO(@Param("ew") Wrapper<SijiaoyuyueEntity> wrapper);
	
	SijiaoyuyueVO selectVO(@Param("ew") Wrapper<SijiaoyuyueEntity> wrapper);
	
	List<SijiaoyuyueView> selectListView(@Param("ew") Wrapper<SijiaoyuyueEntity> wrapper);

	List<SijiaoyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<SijiaoyuyueEntity> wrapper);
	
	SijiaoyuyueView selectView(@Param("ew") Wrapper<SijiaoyuyueEntity> wrapper);
	

}
