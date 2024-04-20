package com.dao;

import com.entity.HuiyuangoumaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuiyuangoumaiVO;
import com.entity.view.HuiyuangoumaiView;


/**
 * 会员购买
 * 
 * @author 
 * @email 
 * @date 2022-03-11 11:00:59
 */
public interface HuiyuangoumaiDao extends BaseMapper<HuiyuangoumaiEntity> {
	
	List<HuiyuangoumaiVO> selectListVO(@Param("ew") Wrapper<HuiyuangoumaiEntity> wrapper);
	
	HuiyuangoumaiVO selectVO(@Param("ew") Wrapper<HuiyuangoumaiEntity> wrapper);
	
	List<HuiyuangoumaiView> selectListView(@Param("ew") Wrapper<HuiyuangoumaiEntity> wrapper);

	List<HuiyuangoumaiView> selectListView(Pagination page,@Param("ew") Wrapper<HuiyuangoumaiEntity> wrapper);
	
	HuiyuangoumaiView selectView(@Param("ew") Wrapper<HuiyuangoumaiEntity> wrapper);
	

}
