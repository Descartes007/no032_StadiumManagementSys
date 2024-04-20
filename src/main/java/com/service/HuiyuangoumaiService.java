package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuiyuangoumaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuiyuangoumaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuiyuangoumaiView;


/**
 * 会员购买
 *
 * @author 
 * @email 
 * @date 2022-03-11 11:00:59
 */
public interface HuiyuangoumaiService extends IService<HuiyuangoumaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuiyuangoumaiVO> selectListVO(Wrapper<HuiyuangoumaiEntity> wrapper);
   	
   	HuiyuangoumaiVO selectVO(@Param("ew") Wrapper<HuiyuangoumaiEntity> wrapper);
   	
   	List<HuiyuangoumaiView> selectListView(Wrapper<HuiyuangoumaiEntity> wrapper);
   	
   	HuiyuangoumaiView selectView(@Param("ew") Wrapper<HuiyuangoumaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuiyuangoumaiEntity> wrapper);
   	

}

