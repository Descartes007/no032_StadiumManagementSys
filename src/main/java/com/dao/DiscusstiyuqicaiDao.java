package com.dao;

import com.entity.DiscusstiyuqicaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusstiyuqicaiVO;
import com.entity.view.DiscusstiyuqicaiView;


/**
 * 体育器材评论表
 * 
 * @author 
 * @email 
 * @date 2022-03-11 11:00:59
 */
public interface DiscusstiyuqicaiDao extends BaseMapper<DiscusstiyuqicaiEntity> {
	
	List<DiscusstiyuqicaiVO> selectListVO(@Param("ew") Wrapper<DiscusstiyuqicaiEntity> wrapper);
	
	DiscusstiyuqicaiVO selectVO(@Param("ew") Wrapper<DiscusstiyuqicaiEntity> wrapper);
	
	List<DiscusstiyuqicaiView> selectListView(@Param("ew") Wrapper<DiscusstiyuqicaiEntity> wrapper);

	List<DiscusstiyuqicaiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusstiyuqicaiEntity> wrapper);
	
	DiscusstiyuqicaiView selectView(@Param("ew") Wrapper<DiscusstiyuqicaiEntity> wrapper);
	

}
