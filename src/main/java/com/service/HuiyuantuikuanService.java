package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuiyuantuikuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuiyuantuikuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuiyuantuikuanView;


/**
 * 会员退款
 *
 * @author 
 * @email 
 * @date 2022-03-11 11:00:59
 */
public interface HuiyuantuikuanService extends IService<HuiyuantuikuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuiyuantuikuanVO> selectListVO(Wrapper<HuiyuantuikuanEntity> wrapper);
   	
   	HuiyuantuikuanVO selectVO(@Param("ew") Wrapper<HuiyuantuikuanEntity> wrapper);
   	
   	List<HuiyuantuikuanView> selectListView(Wrapper<HuiyuantuikuanEntity> wrapper);
   	
   	HuiyuantuikuanView selectView(@Param("ew") Wrapper<HuiyuantuikuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuiyuantuikuanEntity> wrapper);
   	

}

