package com.dao;

import com.entity.DiscusschangdixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusschangdixinxiVO;
import com.entity.view.DiscusschangdixinxiView;


/**
 * 场地信息评论表
 * 
 * @author 
 * @email 
 * @date 2022-03-11 11:00:59
 */
public interface DiscusschangdixinxiDao extends BaseMapper<DiscusschangdixinxiEntity> {
	
	List<DiscusschangdixinxiVO> selectListVO(@Param("ew") Wrapper<DiscusschangdixinxiEntity> wrapper);
	
	DiscusschangdixinxiVO selectVO(@Param("ew") Wrapper<DiscusschangdixinxiEntity> wrapper);
	
	List<DiscusschangdixinxiView> selectListView(@Param("ew") Wrapper<DiscusschangdixinxiEntity> wrapper);

	List<DiscusschangdixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusschangdixinxiEntity> wrapper);
	
	DiscusschangdixinxiView selectView(@Param("ew") Wrapper<DiscusschangdixinxiEntity> wrapper);
	

}
