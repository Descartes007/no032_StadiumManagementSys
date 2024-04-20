package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChangdixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChangdixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChangdixinxiView;


/**
 * 场地信息
 *
 * @author 
 * @email 
 * @date 2022-03-11 11:00:58
 */
public interface ChangdixinxiService extends IService<ChangdixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChangdixinxiVO> selectListVO(Wrapper<ChangdixinxiEntity> wrapper);
   	
   	ChangdixinxiVO selectVO(@Param("ew") Wrapper<ChangdixinxiEntity> wrapper);
   	
   	List<ChangdixinxiView> selectListView(Wrapper<ChangdixinxiEntity> wrapper);
   	
   	ChangdixinxiView selectView(@Param("ew") Wrapper<ChangdixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChangdixinxiEntity> wrapper);
   	

}

