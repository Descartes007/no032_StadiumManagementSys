package com.dao;

import com.entity.HuiyuanyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuiyuanyuyueVO;
import com.entity.view.HuiyuanyuyueView;


/**
 * 会员预约
 * 
 * @author 
 * @email 
 * @date 2022-03-11 11:00:59
 */
public interface HuiyuanyuyueDao extends BaseMapper<HuiyuanyuyueEntity> {
	
	List<HuiyuanyuyueVO> selectListVO(@Param("ew") Wrapper<HuiyuanyuyueEntity> wrapper);
	
	HuiyuanyuyueVO selectVO(@Param("ew") Wrapper<HuiyuanyuyueEntity> wrapper);
	
	List<HuiyuanyuyueView> selectListView(@Param("ew") Wrapper<HuiyuanyuyueEntity> wrapper);

	List<HuiyuanyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<HuiyuanyuyueEntity> wrapper);
	
	HuiyuanyuyueView selectView(@Param("ew") Wrapper<HuiyuanyuyueEntity> wrapper);
	

}
