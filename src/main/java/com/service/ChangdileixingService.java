package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChangdileixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChangdileixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChangdileixingView;


/**
 * 场地类型
 *
 * @author 
 * @email 
 * @date 2022-03-11 11:00:58
 */
public interface ChangdileixingService extends IService<ChangdileixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChangdileixingVO> selectListVO(Wrapper<ChangdileixingEntity> wrapper);
   	
   	ChangdileixingVO selectVO(@Param("ew") Wrapper<ChangdileixingEntity> wrapper);
   	
   	List<ChangdileixingView> selectListView(Wrapper<ChangdileixingEntity> wrapper);
   	
   	ChangdileixingView selectView(@Param("ew") Wrapper<ChangdileixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChangdileixingEntity> wrapper);
   	

}

