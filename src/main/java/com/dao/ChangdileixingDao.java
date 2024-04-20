package com.dao;

import com.entity.ChangdileixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChangdileixingVO;
import com.entity.view.ChangdileixingView;


/**
 * 场地类型
 * 
 * @author 
 * @email 
 * @date 2022-03-11 11:00:58
 */
public interface ChangdileixingDao extends BaseMapper<ChangdileixingEntity> {
	
	List<ChangdileixingVO> selectListVO(@Param("ew") Wrapper<ChangdileixingEntity> wrapper);
	
	ChangdileixingVO selectVO(@Param("ew") Wrapper<ChangdileixingEntity> wrapper);
	
	List<ChangdileixingView> selectListView(@Param("ew") Wrapper<ChangdileixingEntity> wrapper);

	List<ChangdileixingView> selectListView(Pagination page,@Param("ew") Wrapper<ChangdileixingEntity> wrapper);
	
	ChangdileixingView selectView(@Param("ew") Wrapper<ChangdileixingEntity> wrapper);
	

}
