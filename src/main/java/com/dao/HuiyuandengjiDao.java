package com.dao;

import com.entity.HuiyuandengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuiyuandengjiVO;
import com.entity.view.HuiyuandengjiView;


/**
 * 会员等级
 * 
 * @author 
 * @email 
 * @date 2022-03-11 11:00:59
 */
public interface HuiyuandengjiDao extends BaseMapper<HuiyuandengjiEntity> {
	
	List<HuiyuandengjiVO> selectListVO(@Param("ew") Wrapper<HuiyuandengjiEntity> wrapper);
	
	HuiyuandengjiVO selectVO(@Param("ew") Wrapper<HuiyuandengjiEntity> wrapper);
	
	List<HuiyuandengjiView> selectListView(@Param("ew") Wrapper<HuiyuandengjiEntity> wrapper);

	List<HuiyuandengjiView> selectListView(Pagination page,@Param("ew") Wrapper<HuiyuandengjiEntity> wrapper);
	
	HuiyuandengjiView selectView(@Param("ew") Wrapper<HuiyuandengjiEntity> wrapper);
	

}
