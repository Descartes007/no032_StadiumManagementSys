package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuiyuantuidingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuiyuantuidingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuiyuantuidingView;


/**
 * 会员退订
 *
 * @author 
 * @email 
 * @date 2022-03-11 11:00:59
 */
public interface HuiyuantuidingService extends IService<HuiyuantuidingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuiyuantuidingVO> selectListVO(Wrapper<HuiyuantuidingEntity> wrapper);
   	
   	HuiyuantuidingVO selectVO(@Param("ew") Wrapper<HuiyuantuidingEntity> wrapper);
   	
   	List<HuiyuantuidingView> selectListView(Wrapper<HuiyuantuidingEntity> wrapper);
   	
   	HuiyuantuidingView selectView(@Param("ew") Wrapper<HuiyuantuidingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuiyuantuidingEntity> wrapper);
   	

}

