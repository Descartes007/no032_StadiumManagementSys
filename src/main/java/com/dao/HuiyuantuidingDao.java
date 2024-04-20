package com.dao;

import com.entity.HuiyuantuidingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuiyuantuidingVO;
import com.entity.view.HuiyuantuidingView;


/**
 * 会员退订
 * 
 * @author 
 * @email 
 * @date 2022-03-11 11:00:59
 */
public interface HuiyuantuidingDao extends BaseMapper<HuiyuantuidingEntity> {
	
	List<HuiyuantuidingVO> selectListVO(@Param("ew") Wrapper<HuiyuantuidingEntity> wrapper);
	
	HuiyuantuidingVO selectVO(@Param("ew") Wrapper<HuiyuantuidingEntity> wrapper);
	
	List<HuiyuantuidingView> selectListView(@Param("ew") Wrapper<HuiyuantuidingEntity> wrapper);

	List<HuiyuantuidingView> selectListView(Pagination page,@Param("ew") Wrapper<HuiyuantuidingEntity> wrapper);
	
	HuiyuantuidingView selectView(@Param("ew") Wrapper<HuiyuantuidingEntity> wrapper);
	

}
