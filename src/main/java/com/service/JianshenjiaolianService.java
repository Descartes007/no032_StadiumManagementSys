package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JianshenjiaolianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JianshenjiaolianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JianshenjiaolianView;


/**
 * 健身教练
 *
 * @author 
 * @email 
 * @date 2022-03-11 11:00:58
 */
public interface JianshenjiaolianService extends IService<JianshenjiaolianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JianshenjiaolianVO> selectListVO(Wrapper<JianshenjiaolianEntity> wrapper);
   	
   	JianshenjiaolianVO selectVO(@Param("ew") Wrapper<JianshenjiaolianEntity> wrapper);
   	
   	List<JianshenjiaolianView> selectListView(Wrapper<JianshenjiaolianEntity> wrapper);
   	
   	JianshenjiaolianView selectView(@Param("ew") Wrapper<JianshenjiaolianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JianshenjiaolianEntity> wrapper);
   	

}

