package com.dao;

import com.entity.QicaituidingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QicaituidingVO;
import com.entity.view.QicaituidingView;


/**
 * 器材退订
 * 
 * @author 
 * @email 
 * @date 2022-03-11 11:00:59
 */
public interface QicaituidingDao extends BaseMapper<QicaituidingEntity> {
	
	List<QicaituidingVO> selectListVO(@Param("ew") Wrapper<QicaituidingEntity> wrapper);
	
	QicaituidingVO selectVO(@Param("ew") Wrapper<QicaituidingEntity> wrapper);
	
	List<QicaituidingView> selectListView(@Param("ew") Wrapper<QicaituidingEntity> wrapper);

	List<QicaituidingView> selectListView(Pagination page,@Param("ew") Wrapper<QicaituidingEntity> wrapper);
	
	QicaituidingView selectView(@Param("ew") Wrapper<QicaituidingEntity> wrapper);
	

}
