package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SirenjiaolianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SirenjiaolianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SirenjiaolianView;


/**
 * 私人教练
 *
 * @author 
 * @email 
 * @date 2022-03-11 11:00:59
 */
public interface SirenjiaolianService extends IService<SirenjiaolianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SirenjiaolianVO> selectListVO(Wrapper<SirenjiaolianEntity> wrapper);
   	
   	SirenjiaolianVO selectVO(@Param("ew") Wrapper<SirenjiaolianEntity> wrapper);
   	
   	List<SirenjiaolianView> selectListView(Wrapper<SirenjiaolianEntity> wrapper);
   	
   	SirenjiaolianView selectView(@Param("ew") Wrapper<SirenjiaolianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SirenjiaolianEntity> wrapper);
   	

}

