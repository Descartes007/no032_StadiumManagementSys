package com.dao;

import com.entity.SirenjiaolianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SirenjiaolianVO;
import com.entity.view.SirenjiaolianView;


/**
 * 私人教练
 * 
 * @author 
 * @email 
 * @date 2022-03-11 11:00:59
 */
public interface SirenjiaolianDao extends BaseMapper<SirenjiaolianEntity> {
	
	List<SirenjiaolianVO> selectListVO(@Param("ew") Wrapper<SirenjiaolianEntity> wrapper);
	
	SirenjiaolianVO selectVO(@Param("ew") Wrapper<SirenjiaolianEntity> wrapper);
	
	List<SirenjiaolianView> selectListView(@Param("ew") Wrapper<SirenjiaolianEntity> wrapper);

	List<SirenjiaolianView> selectListView(Pagination page,@Param("ew") Wrapper<SirenjiaolianEntity> wrapper);
	
	SirenjiaolianView selectView(@Param("ew") Wrapper<SirenjiaolianEntity> wrapper);
	

}
