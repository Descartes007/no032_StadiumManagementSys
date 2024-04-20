package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QicaileixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QicaileixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QicaileixingView;


/**
 * 器材类型
 *
 * @author 
 * @email 
 * @date 2022-03-11 11:00:59
 */
public interface QicaileixingService extends IService<QicaileixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QicaileixingVO> selectListVO(Wrapper<QicaileixingEntity> wrapper);
   	
   	QicaileixingVO selectVO(@Param("ew") Wrapper<QicaileixingEntity> wrapper);
   	
   	List<QicaileixingView> selectListView(Wrapper<QicaileixingEntity> wrapper);
   	
   	QicaileixingView selectView(@Param("ew") Wrapper<QicaileixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QicaileixingEntity> wrapper);
   	

}

