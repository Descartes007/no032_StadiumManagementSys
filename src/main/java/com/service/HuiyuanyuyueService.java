package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuiyuanyuyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuiyuanyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuiyuanyuyueView;


/**
 * 会员预约
 *
 * @author 
 * @email 
 * @date 2022-03-11 11:00:59
 */
public interface HuiyuanyuyueService extends IService<HuiyuanyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuiyuanyuyueVO> selectListVO(Wrapper<HuiyuanyuyueEntity> wrapper);
   	
   	HuiyuanyuyueVO selectVO(@Param("ew") Wrapper<HuiyuanyuyueEntity> wrapper);
   	
   	List<HuiyuanyuyueView> selectListView(Wrapper<HuiyuanyuyueEntity> wrapper);
   	
   	HuiyuanyuyueView selectView(@Param("ew") Wrapper<HuiyuanyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuiyuanyuyueEntity> wrapper);
   	

}

