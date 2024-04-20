package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusschangdixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusschangdixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusschangdixinxiView;


/**
 * 场地信息评论表
 *
 * @author 
 * @email 
 * @date 2022-03-11 11:00:59
 */
public interface DiscusschangdixinxiService extends IService<DiscusschangdixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusschangdixinxiVO> selectListVO(Wrapper<DiscusschangdixinxiEntity> wrapper);
   	
   	DiscusschangdixinxiVO selectVO(@Param("ew") Wrapper<DiscusschangdixinxiEntity> wrapper);
   	
   	List<DiscusschangdixinxiView> selectListView(Wrapper<DiscusschangdixinxiEntity> wrapper);
   	
   	DiscusschangdixinxiView selectView(@Param("ew") Wrapper<DiscusschangdixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusschangdixinxiEntity> wrapper);
   	

}

