package com.dao;

import com.entity.DiscusssirenjiaolianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusssirenjiaolianVO;
import com.entity.view.DiscusssirenjiaolianView;


/**
 * 私人教练评论表
 * 
 * @author 
 * @email 
 * @date 2022-03-11 11:00:59
 */
public interface DiscusssirenjiaolianDao extends BaseMapper<DiscusssirenjiaolianEntity> {
	
	List<DiscusssirenjiaolianVO> selectListVO(@Param("ew") Wrapper<DiscusssirenjiaolianEntity> wrapper);
	
	DiscusssirenjiaolianVO selectVO(@Param("ew") Wrapper<DiscusssirenjiaolianEntity> wrapper);
	
	List<DiscusssirenjiaolianView> selectListView(@Param("ew") Wrapper<DiscusssirenjiaolianEntity> wrapper);

	List<DiscusssirenjiaolianView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusssirenjiaolianEntity> wrapper);
	
	DiscusssirenjiaolianView selectView(@Param("ew") Wrapper<DiscusssirenjiaolianEntity> wrapper);
	

}
