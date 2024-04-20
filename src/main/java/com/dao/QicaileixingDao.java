package com.dao;

import com.entity.QicaileixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QicaileixingVO;
import com.entity.view.QicaileixingView;


/**
 * 器材类型
 * 
 * @author 
 * @email 
 * @date 2022-03-11 11:00:59
 */
public interface QicaileixingDao extends BaseMapper<QicaileixingEntity> {
	
	List<QicaileixingVO> selectListVO(@Param("ew") Wrapper<QicaileixingEntity> wrapper);
	
	QicaileixingVO selectVO(@Param("ew") Wrapper<QicaileixingEntity> wrapper);
	
	List<QicaileixingView> selectListView(@Param("ew") Wrapper<QicaileixingEntity> wrapper);

	List<QicaileixingView> selectListView(Pagination page,@Param("ew") Wrapper<QicaileixingEntity> wrapper);
	
	QicaileixingView selectView(@Param("ew") Wrapper<QicaileixingEntity> wrapper);
	

}
