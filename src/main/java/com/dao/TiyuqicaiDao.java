package com.dao;

import com.entity.TiyuqicaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TiyuqicaiVO;
import com.entity.view.TiyuqicaiView;


/**
 * 体育器材
 * 
 * @author 
 * @email 
 * @date 2022-03-11 11:00:59
 */
public interface TiyuqicaiDao extends BaseMapper<TiyuqicaiEntity> {
	
	List<TiyuqicaiVO> selectListVO(@Param("ew") Wrapper<TiyuqicaiEntity> wrapper);
	
	TiyuqicaiVO selectVO(@Param("ew") Wrapper<TiyuqicaiEntity> wrapper);
	
	List<TiyuqicaiView> selectListView(@Param("ew") Wrapper<TiyuqicaiEntity> wrapper);

	List<TiyuqicaiView> selectListView(Pagination page,@Param("ew") Wrapper<TiyuqicaiEntity> wrapper);
	
	TiyuqicaiView selectView(@Param("ew") Wrapper<TiyuqicaiEntity> wrapper);
	

}
