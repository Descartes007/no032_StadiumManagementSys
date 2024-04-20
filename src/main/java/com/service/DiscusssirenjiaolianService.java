package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusssirenjiaolianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusssirenjiaolianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusssirenjiaolianView;


/**
 * 私人教练评论表
 *
 * @author 
 * @email 
 * @date 2022-03-11 11:00:59
 */
public interface DiscusssirenjiaolianService extends IService<DiscusssirenjiaolianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusssirenjiaolianVO> selectListVO(Wrapper<DiscusssirenjiaolianEntity> wrapper);
   	
   	DiscusssirenjiaolianVO selectVO(@Param("ew") Wrapper<DiscusssirenjiaolianEntity> wrapper);
   	
   	List<DiscusssirenjiaolianView> selectListView(Wrapper<DiscusssirenjiaolianEntity> wrapper);
   	
   	DiscusssirenjiaolianView selectView(@Param("ew") Wrapper<DiscusssirenjiaolianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusssirenjiaolianEntity> wrapper);
   	

}

