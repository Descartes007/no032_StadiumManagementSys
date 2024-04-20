package com.dao;

import com.entity.ChangdiyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChangdiyuyueVO;
import com.entity.view.ChangdiyuyueView;


/**
 * 场地预约
 * 
 * @author 
 * @email 
 * @date 2022-03-11 11:00:58
 */
public interface ChangdiyuyueDao extends BaseMapper<ChangdiyuyueEntity> {
	
	List<ChangdiyuyueVO> selectListVO(@Param("ew") Wrapper<ChangdiyuyueEntity> wrapper);
	
	ChangdiyuyueVO selectVO(@Param("ew") Wrapper<ChangdiyuyueEntity> wrapper);
	
	List<ChangdiyuyueView> selectListView(@Param("ew") Wrapper<ChangdiyuyueEntity> wrapper);

	List<ChangdiyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<ChangdiyuyueEntity> wrapper);
	
	ChangdiyuyueView selectView(@Param("ew") Wrapper<ChangdiyuyueEntity> wrapper);
	

}
