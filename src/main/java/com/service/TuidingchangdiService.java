package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TuidingchangdiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TuidingchangdiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TuidingchangdiView;


/**
 * 退订场地
 *
 * @author 
 * @email 
 * @date 2022-03-11 11:00:59
 */
public interface TuidingchangdiService extends IService<TuidingchangdiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TuidingchangdiVO> selectListVO(Wrapper<TuidingchangdiEntity> wrapper);
   	
   	TuidingchangdiVO selectVO(@Param("ew") Wrapper<TuidingchangdiEntity> wrapper);
   	
   	List<TuidingchangdiView> selectListView(Wrapper<TuidingchangdiEntity> wrapper);
   	
   	TuidingchangdiView selectView(@Param("ew") Wrapper<TuidingchangdiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TuidingchangdiEntity> wrapper);
   	

}

