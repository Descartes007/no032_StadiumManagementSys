package com.dao;

import com.entity.QicaigoumaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QicaigoumaiVO;
import com.entity.view.QicaigoumaiView;


/**
 * 器材购买
 * 
 * @author 
 * @email 
 * @date 2022-03-11 11:00:59
 */
public interface QicaigoumaiDao extends BaseMapper<QicaigoumaiEntity> {
	
	List<QicaigoumaiVO> selectListVO(@Param("ew") Wrapper<QicaigoumaiEntity> wrapper);
	
	QicaigoumaiVO selectVO(@Param("ew") Wrapper<QicaigoumaiEntity> wrapper);
	
	List<QicaigoumaiView> selectListView(@Param("ew") Wrapper<QicaigoumaiEntity> wrapper);

	List<QicaigoumaiView> selectListView(Pagination page,@Param("ew") Wrapper<QicaigoumaiEntity> wrapper);
	
	QicaigoumaiView selectView(@Param("ew") Wrapper<QicaigoumaiEntity> wrapper);
	

}
