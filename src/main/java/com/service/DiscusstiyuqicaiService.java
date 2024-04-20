package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusstiyuqicaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusstiyuqicaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusstiyuqicaiView;


/**
 * 体育器材评论表
 *
 * @author 
 * @email 
 * @date 2022-03-11 11:00:59
 */
public interface DiscusstiyuqicaiService extends IService<DiscusstiyuqicaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusstiyuqicaiVO> selectListVO(Wrapper<DiscusstiyuqicaiEntity> wrapper);
   	
   	DiscusstiyuqicaiVO selectVO(@Param("ew") Wrapper<DiscusstiyuqicaiEntity> wrapper);
   	
   	List<DiscusstiyuqicaiView> selectListView(Wrapper<DiscusstiyuqicaiEntity> wrapper);
   	
   	DiscusstiyuqicaiView selectView(@Param("ew") Wrapper<DiscusstiyuqicaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusstiyuqicaiEntity> wrapper);
   	

}

