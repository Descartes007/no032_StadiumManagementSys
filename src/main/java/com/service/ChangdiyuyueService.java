package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChangdiyuyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChangdiyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChangdiyuyueView;


/**
 * 场地预约
 *
 * @author 
 * @email 
 * @date 2022-03-11 11:00:58
 */
public interface ChangdiyuyueService extends IService<ChangdiyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChangdiyuyueVO> selectListVO(Wrapper<ChangdiyuyueEntity> wrapper);
   	
   	ChangdiyuyueVO selectVO(@Param("ew") Wrapper<ChangdiyuyueEntity> wrapper);
   	
   	List<ChangdiyuyueView> selectListView(Wrapper<ChangdiyuyueEntity> wrapper);
   	
   	ChangdiyuyueView selectView(@Param("ew") Wrapper<ChangdiyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChangdiyuyueEntity> wrapper);
   	

}

