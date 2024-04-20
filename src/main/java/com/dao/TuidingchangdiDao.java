package com.dao;

import com.entity.TuidingchangdiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TuidingchangdiVO;
import com.entity.view.TuidingchangdiView;


/**
 * 退订场地
 * 
 * @author 
 * @email 
 * @date 2022-03-11 11:00:59
 */
public interface TuidingchangdiDao extends BaseMapper<TuidingchangdiEntity> {
	
	List<TuidingchangdiVO> selectListVO(@Param("ew") Wrapper<TuidingchangdiEntity> wrapper);
	
	TuidingchangdiVO selectVO(@Param("ew") Wrapper<TuidingchangdiEntity> wrapper);
	
	List<TuidingchangdiView> selectListView(@Param("ew") Wrapper<TuidingchangdiEntity> wrapper);

	List<TuidingchangdiView> selectListView(Pagination page,@Param("ew") Wrapper<TuidingchangdiEntity> wrapper);
	
	TuidingchangdiView selectView(@Param("ew") Wrapper<TuidingchangdiEntity> wrapper);
	

}
