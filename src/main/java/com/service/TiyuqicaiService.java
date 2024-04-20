package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TiyuqicaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TiyuqicaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TiyuqicaiView;


/**
 * 体育器材
 *
 * @author 
 * @email 
 * @date 2022-03-11 11:00:59
 */
public interface TiyuqicaiService extends IService<TiyuqicaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TiyuqicaiVO> selectListVO(Wrapper<TiyuqicaiEntity> wrapper);
   	
   	TiyuqicaiVO selectVO(@Param("ew") Wrapper<TiyuqicaiEntity> wrapper);
   	
   	List<TiyuqicaiView> selectListView(Wrapper<TiyuqicaiEntity> wrapper);
   	
   	TiyuqicaiView selectView(@Param("ew") Wrapper<TiyuqicaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TiyuqicaiEntity> wrapper);
   	

}

