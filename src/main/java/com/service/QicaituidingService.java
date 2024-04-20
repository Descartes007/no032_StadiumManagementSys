package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QicaituidingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QicaituidingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QicaituidingView;


/**
 * 器材退订
 *
 * @author 
 * @email 
 * @date 2022-03-11 11:00:59
 */
public interface QicaituidingService extends IService<QicaituidingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QicaituidingVO> selectListVO(Wrapper<QicaituidingEntity> wrapper);
   	
   	QicaituidingVO selectVO(@Param("ew") Wrapper<QicaituidingEntity> wrapper);
   	
   	List<QicaituidingView> selectListView(Wrapper<QicaituidingEntity> wrapper);
   	
   	QicaituidingView selectView(@Param("ew") Wrapper<QicaituidingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QicaituidingEntity> wrapper);
   	

}

